package easy_1000;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Raspberries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int e=0;
            int ans=Integer.MAX_VALUE;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                int c=a%k==0?0:k-(a%k);
                ans=Math.min(ans,c);
                if(a%2==0)e++;
            }
            if(k==4) {
                if(e>=2) System.out.println(0);
                else
                System.out.println(Math.min(ans,2-e));
            }
            else System.out.println(ans);
        }
    }
}
