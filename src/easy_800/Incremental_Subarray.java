package easy_800;

import java.util.Scanner;

public class Incremental_Subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[m];
            for (int i = 0; i < m; i++) a[i] = sc.nextInt();
            if (isSorted(a)) {
                System.out.println(n-a[m-1]+1);
            } else System.out.println(1);
        }
    }
    static boolean isSorted(int a[]){
        for(int i=1;i<a.length;i++){
            if(a[i]<=a[i-1])return  false;
        }
        return true;
    }
}
