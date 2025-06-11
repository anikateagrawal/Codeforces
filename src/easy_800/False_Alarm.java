package easy_800;

import java.util.Scanner;

public class False_Alarm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            int f=-1,l=-1;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==1){
                    if(f==-1)f=i;
                    l=i;
                }
            }
            if(l-f<x) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
