package easy_1100;

import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int k=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int mi=0;
        int sum=0;
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            sum+=a[i];
            if(i>=k-1){
                if(sum<min){
                    min=sum;
                    mi=i-k+1;
                }
                sum-=a[i-k+1];
            }
        }
        System.out.println(mi+1);
    }
}
