package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Mark_the_Photographer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[2*n];
            for (int i=0;i<2*n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            boolean flag=true;
            for (int i=0;i<n;i++){
                int i2=i+n;
                if(a[i2]-a[i]<x){
                    flag=false;
                    break;
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
