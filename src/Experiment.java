public class Experiment {
    private Sorter sorter;
    private Searcher searcher;

    public Experiment(Sorter sorter,Searcher sesrcher){
        this.sorter=sorter;
        this.searcher=sesrcher;
    }

    public long measureSortTime(int[] arr,String type) {
        long startTime = System.nanoTime();

        if (type.equalsIgnoreCase("basic")) {
            sorter.basicSort(arr);
        } else if (type.equalsIgnoreCase("advanced")) {
            sorter.advancedSort(arr);
        }

        long endTime = System.nanoTime();
        return (endTime - startTime);
    }

    public long measureSearchTime(int[] arr,int target) {
        long startTime = System.nanoTime();
        searcher.search(arr,target);
        long endTime = System.nanoTime();
        return (endTime - startTime);
    }

    public void runAllExperiments(){
       int[] sizes={10,100,1000};
               for (int size:sizes){
                   System.out.println("--- Experiment for size: " + size + " ---");

                   int[] randomArray = sorter.generateRandomArray(size);
                   long tBasic = measureSortTime(randomArray.clone(), "basic");
                   long tAdvanced = measureSortTime(randomArray.clone(), "advanced");

                   int[] sortedArray = randomArray.clone();
                   sorter.advancedSort(sortedArray);
                   int target = sortedArray[size / 2];
                   long tSearch = measureSearchTime(sortedArray, target);

                   System.out.println("Random Data - Basic: " + tBasic + "ns, Advanced: " + tAdvanced + "ns");
                   System.out.println("Search Time: " + tSearch + "ns\n");
               }
    }
    }

