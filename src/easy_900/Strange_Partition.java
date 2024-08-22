package easy_900;

import java.util.Scanner;

public class Strange_Partition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            long sum=0;
            long max=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                max+=(long)Math.ceil(a*1.0/x);
                sum+=a;
            }
            System.out.println((long)Math.ceil(sum*1.0/x)+" "+max);
        }
    }
}
