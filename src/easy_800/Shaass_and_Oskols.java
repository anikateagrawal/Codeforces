package easy_800;

import java.util.Scanner;

public class Shaass_and_Oskols {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        int m=sc.nextInt();
        while (m-->0){
            int x=sc.nextInt()-1;
            int y=sc.nextInt();
            if(x>0) a[x-1]+=y-1;
            if(x<n-1) a[x+1]+=a[x]-y;
            a[x]=0;
        }
        for (int i:a) System.out.println(i);
    }
}
