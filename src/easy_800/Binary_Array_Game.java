package easy_800;

import java.util.Scanner;

public class Binary_Array_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            if(a[0]==0 && a[n-1]==0) System.out.println("Bob");
            else System.out.println("Alice");
        }
    }
}
