package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Median_of_an_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int m=(n-1)/2;
            int in=1;
            for(int i=m;i<n-1;i++){
                if(a[i]==a[i+1])in++;
                else break;
            }
            System.out.println(in);
        }
    }
}
