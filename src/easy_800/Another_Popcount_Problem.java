package easy_800;

import java.util.Scanner;

public class Another_Popcount_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(k>=n) System.out.println(n);
            else {
                int d=n/k;
                String s=Integer.toBinaryString(d);
                int m=s.length()-1;
                if (!s.contains("0")) {
                    m=s.length();
                }
                int n1=(1<<m)-1;
                int r = n - n1*k;
                int ans=m*k + r/(1<<(m));
                System.out.println(ans);
            }
        }
    }
}
