package contests;

import java.util.Scanner;

public class Likes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int p=0,nn=0;
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                if(a<0)nn++;
                else p++;
            }
            int i;
            for (i = 1; i <=p ; i++) {
                System.out.print(i+" ");
            }
            i--;
            int m=nn;
            while (nn-->0) System.out.print(--i+" ");
            System.out.println();
            nn=m;
            for (int j = 0; j < nn; j++) {
                System.out.print(1+" "+0+" ");
            }
            p-=nn;
            for (int j = 0; j < p; j++) {
                System.out.print((j+1)+" ");
            }
            System.out.println();

        }
    }
}
