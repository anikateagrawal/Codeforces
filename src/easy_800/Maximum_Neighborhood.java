package easy_800;

import java.util.Scanner;

public class Maximum_Neighborhood {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if (n==1) System.out.println(1);
            else if (n==2) System.out.println(9);
            else {
                int sq=n*n;
                int m1=4*sq - n - 4;
                int m2=5*sq - 5*n - 5;
                System.out.println(Math.max(m1,m2));
            }
        }
    }
}
