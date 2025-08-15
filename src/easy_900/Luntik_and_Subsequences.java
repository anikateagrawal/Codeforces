package easy_900;

import java.util.Scanner;

public class Luntik_and_Subsequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            long sum=0;
            int ones=0,zeroes=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
                if(a[i]==1)ones++;
                if (a[i]==0)zeroes++;
            }
            long ans=(long)(Math.pow(2,zeroes)*ones);
            System.out.println(ans);

        }
    }
}
