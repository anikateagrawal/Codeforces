package easy_800;

import java.util.Scanner;

public class Bazoka_and_Mochas_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int d=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if (i>0 && a[i]<a[i-1])d++;
            }
            if (d==0) System.out.println("Yes");
            else {
                if (d>1 || a[n-1]>a[0]) System.out.println("No");
                else System.out.println("Yes");
            }
        }
    }
}
