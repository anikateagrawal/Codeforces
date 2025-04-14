package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class Splitting_Items {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            for (int i=n-2;i>=0;i-=2){
                int d=a[i+1]-a[i];
                int min=Math.min(d,k);
                k-=min;
                a[i]+=min;
            }
            int bob=0,alice=0;
            for (int i=0;i<n;i++){
                if(i%2==0)alice+=a[n-i-1];
                else bob+=a[n-i-1];
            }
            System.out.println(Math.abs(alice-bob));
        }
    }
}
