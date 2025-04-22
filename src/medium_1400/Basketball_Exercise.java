package medium_1400;

import java.util.Scanner;

public class Basketball_Exercise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[][]=new long[2][n];
        for (int i=0;i<n;i++)a[0][i]=sc.nextInt();
        for (int i=0;i<n;i++)a[1][i]=sc.nextInt();
        for (int i=1;i<n;i++){
            long m1=a[1][i-1];
            long m2=a[0][i-1];
            if(i>1){
                m1=Math.max(m1,a[1][i-2]);
                m2=Math.max(m2,a[0][i-2]);
            }
            a[0][i]+=m1;
            a[1][i]+=m2;
//            System.out.println(a[0][i]+" "+a[1][i]);
        }
        System.out.println(Math.max(a[0][n-1],a[1][n-1]));
    }

}
