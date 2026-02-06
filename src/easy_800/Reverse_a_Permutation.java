package easy_800;

import java.util.Scanner;

public class Reverse_a_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int i=0;
            while (i<n && a[i]==n-i)i++;
            if(i!=n){
                int j=i+1;
                int f=n-i;
                while (j<n && a[j]!=f){
                    j++;
                }
                while (i<j){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                    i++;j--;
                }
            }
            for (int num:a) System.out.print(num+" ");
            System.out.println();
        }
    }
}
