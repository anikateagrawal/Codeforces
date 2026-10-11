package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Rearrangment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int b[]=new int[n];
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            boolean f=true;
            for (int i=0;i<n;i++){
                if (a[i]+b[n-i-1]>x){
                    f=false;
                    break;
                }
            }
            System.out.println(f?"YES":"NO");
        }
    }
}
