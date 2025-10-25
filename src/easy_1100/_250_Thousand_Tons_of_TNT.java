package easy_1100;

import java.util.Scanner;

public class _250_Thousand_Tons_of_TNT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            long max=0;
            for (int i=1;i<=n;i++){
                if(n%i!=0)continue;
                max=Math.max(max,diff(a,i));
            }
            System.out.println(max);
        }
    }
    static long diff(int a[],int k){
        long max=0,min=Long.MAX_VALUE;
        long sum=0;
        for (int i=0;i<a.length;i++) {
            sum += a[i];
            if ((i + 1) % k == 0) {
                max = Math.max(max, sum);
                min = Math.min(min, sum);
                sum = 0;
            }
        }
        return max-min;
    }
}
