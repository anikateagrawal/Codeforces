package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Arrays_And_Swaps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            for(int i=0;i<n;i++)b[i]=sc.nextInt();
            Arrays.sort(b);
            int sum=0;
            for(int i=0;i<n;i++){
                if(a[i]<b[n-i-1]&&k>0){
                    sum+=b[n-i-1];
                    k--;
                }
                else sum+=a[i];
            }
            System.out.println(sum);
        }
    }
}
