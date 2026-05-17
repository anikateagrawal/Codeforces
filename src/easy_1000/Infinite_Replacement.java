package easy_1000;

import java.util.Scanner;

public class Infinite_Replacement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long f[]=new long[55];
        f[0]=f[1]=1;
        for (int i=2;i<f.length;i++){
            f[i]=i*f[i-1];
        }
        while (t-->0){
            String a=sc.next();
            String b=sc.next();
            if (b.equals("a")) System.out.println(1);
            else if (b.contains("a")) System.out.println(-1);
            else {
                int n=a.length();
                System.out.println((long)Math.pow(2,n));
            }
        }
    }
}
