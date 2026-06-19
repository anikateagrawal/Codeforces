package other;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={2,6,3,7,5};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));;
    }
    static void sort(int arr[], int l, int r){
        if (l>=r) return;
        int pi=partition(arr, l, r);
        System.out.println(Arrays.toString(arr)+" "+l+" "+r);
        System.out.println(pi);
        sort(arr, l,pi-1);
        sort(arr,pi+1,r);

    }
    static int partition(int arr[], int l, int r){
        int pivot=arr[r];
        int pi=l;

        for (int i=l;i<=r;i++){
            if (arr[i]<=pivot){
                int tmp=arr[i];
                arr[i]=arr[pi];
                arr[pi]=tmp;
                pi++;
            }
        }
        return pi-1;
    }
}
