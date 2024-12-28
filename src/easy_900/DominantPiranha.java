package easy_900;

import java.util.Scanner;
import java.util.TreeSet;

public class DominantPiranha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                int v=sc.nextInt();
                a[i]=v;
                if(v>max){
                    max=v;
                }
                if(v<min){
                    min=v;
                }
            }
            if(max==min) System.out.println(-1);
            else {
                int in=-1;
                for (int i=0;i<n-1;i++){
                    if(a[i]!=a[i+1]){
                        if(a[i]==max)in=i;
                        else if(a[i+1]==max)in=i+1;
                    }
                }
                System.out.println(in+1);
            }
        }
    }
}
