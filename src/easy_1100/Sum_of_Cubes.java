package easy_1100;

import java.util.Scanner;

public class Sum_of_Cubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        outer:
        while (t-->0){
            long n= sc.nextLong();
            for(long i=1;i<Math.cbrt(n);i++){
                long d=n-i*i*i;
                double dv=Math.cbrt(d);
                if(dv==(long)dv){
                    System.out.println("YES");
                    continue outer;
                }
            }
            System.out.println("NO");
        }
    }
}
