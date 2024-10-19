package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Alice_and_Books {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int max=a[0];
            int maxi=0;
            for (int i=0;i<n;i++) {
                if (a[i] >= max) {
                    max = a[i];
                    maxi = i;
                }
            }
            if(maxi==a.length-1){
                Arrays.sort(a);
                System.out.println(a[a.length-2]+max);
            }
            else System.out.println(max+a[a.length-1]);
        }
    }
}
