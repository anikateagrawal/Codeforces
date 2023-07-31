package medium_1400;

import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int ei=0,si=0;
        int ans=0;
        int sum=0;
        while(ei<n){
            sum+=a[ei];
            while(si<=ei&&sum>t){
                sum-=a[si++];
            }
            ei++;
            ans=Math.max(ans,ei-si);
        }
        System.out.println(ans);
    }
}
