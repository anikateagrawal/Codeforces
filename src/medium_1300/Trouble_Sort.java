package medium_1300;

import java.util.Scanner;

public class Trouble_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            boolean diff=false;
            for (int i=1;i<n;i++)if(b[i]!=b[i-1])diff=true;
            if(diff) System.out.println("YES");
            else {
                boolean sort=true;
                for (int i=1;i<n;i++)if(a[i]<a[i-1])sort=false;
                if(sort) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
