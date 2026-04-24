import java.util.Random;

public class Sorter {
    public void basicSort(int[] arr){
        int n=arr.length;
        for (int i=1;i<n;++i){
            int key=arr[i];
            int j=i-1;

            while(j>=0 &&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    public void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }

        System.out.println();
    }

    public int[] generateRandomArray(int size){
        Random rand =new Random();
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=rand.nextInt(1000);
        }

        return arr;

    }

    public void advancedSort(int[] arr){
        mergeSort(arr,0,arr.length-1);
    }

    private void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;

            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    private void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] leftArr=new int[n1];
        int[] rightArr=new int[n2];

        for(int i=0;i< n1; ++i) leftArr[i]=arr[left+i];
        for(int j=0;j < n2; ++j) rightArr[j]=arr[mid+1+j];

        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }
            else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }

        while(i< n1){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j< n2){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
    }
}
