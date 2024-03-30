package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class GamingForces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int [n];
            int o=0;
            for (int i=0;i<n;i++){
                int v=sc.nextInt();
                if(v==1)o++;
            }
            int m=o/2+n-o/2*2;
            System.out.println(m);

        }
    }
}
