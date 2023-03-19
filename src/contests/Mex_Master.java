package contests;

import java.util.*;

public class Mex_Master {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int n0=0,n1=0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0) n0++;
                else if (a[i] == 1) n1++;
            }
            if(n0<=(n+1)/2) System.out.println(0);
            else if(n0+n1==n&&n1>0) System.out.println(2);
            else System.out.println(1);
        }
    }
}
