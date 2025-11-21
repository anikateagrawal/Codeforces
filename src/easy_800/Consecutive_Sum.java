package easy_800;

import java.util.Scanner;

public class Consecutive_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[k];
            for (int i=0;i<n;i++){
                int v=sc.nextInt();
                a[i%k]=Math.max(a[i%k],v);
            }
            long sum=0;
            for (int i:a)sum+=i;
            System.out.println(sum);
        }
    }
}
