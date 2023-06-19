package datastructure;

public class Algorithm {
    public static int factRecursion(int n,int f){
        if (n==0)return f;
        return factRecursion(n-1,n*f);
    }
    public static int sumRecursion(int num,int sum){
        if (num==0)return sum;
        return sumRecursion(num-1,sum+num);

    }

    public static void mergeSort(int []arr,int start,int end){
        if(start==end)return;
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);

    }

    public static void merge(int[] arr, int start, int mid, int end) {
         int length1=mid-start+1,length2=end-mid;
         int []left=new int[length1];
         int []right=new int[length2];
         for (int i=0;i<length1;i++)left[i]=arr[start+i];
         for (int i=0;i<length2;i++)right[i]=arr[mid+i+1];

        int leftIndex=0,rightIndex=0,i=start;
        while (leftIndex<length1&&rightIndex<length2){
            if (left[leftIndex]<=right[rightIndex]){
                arr[i]=left[leftIndex];
                leftIndex++;
            }else {
                arr[i]=right[rightIndex];
                rightIndex++;
            }
            i++;
        }
        while (leftIndex<left.length){
            arr[i++]=left[leftIndex++];
        }
        while (rightIndex<right.length) {
            arr[i++] = right[rightIndex++];
        }
    }
    public static void printArray(int []arr){
        for (int i:arr) System.out.print(i+" ");
    }
}
