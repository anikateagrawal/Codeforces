package easy_800;

import java.util.Scanner;

public class Strange_Splitting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            if(a[n-1]-a[0]==a[1]-a[1]) System.out.println("NO");
            else {
                System.out.println("YES");
                System.out.print("BR");
                for (int i=0;i<n-2;i++) System.out.print("B");
                System.out.println();
            }
        }
    }
}
