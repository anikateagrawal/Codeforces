package medium_1300;

import java.util.Scanner;

public class Just_Eat_It {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            long total=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                total+=a[i];
            }
            long max=Math.max(maxSubSum(a,1,n),maxSubSum(a,0,n-1));
            if(max>=total) System.out.println("NO");
            else System.out.println("YES");
        }
    }
    static long maxSubSum(int a[],int s,int e){
        long max=0;
        long sum=0;
        for (int i=s;i<e;i++){
            sum+=a[i];
            max=Math.max(max,sum);
            if(sum<0)sum=0;
        }
        return max;
    }
}
