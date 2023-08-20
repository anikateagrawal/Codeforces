package easy_800;

import java.util.Scanner;

public class Gifts_Fixing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            int mina=Integer.MAX_VALUE;
            int minb=Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
                mina=Math.min(mina,a[i]);
            }
            for (int i = 0; i < n; i++) {
                b[i]=sc.nextInt();
                minb=Math.min(minb,b[i]);
            }
            long m=0;
            for (int i = 0; i < n; i++) {
                int da=a[i]-mina;
                int db=b[i]-minb;
                int d=Math.min(da,db);
                m+=da+db-d;
            }
            System.out.println(m);
        }

    }
}
