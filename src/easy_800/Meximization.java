package easy_800;

import java.util.Scanner;
import java.util.TreeSet;

public class Meximization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int f[]=new int[101];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                f[a[i]]++;
            }
            int in=0;
            for(int i=0;i<100;i++){
                for (int j=0;j<=100;j++){
                    if(f[j]!=0){
                        a[in++]=j;
                        f[j]--;
                    }
                }
            }
            for (int i=0;i<n;i++) System.out.print(a[i]+" ");
            System.out.println();

        }
    }
}
