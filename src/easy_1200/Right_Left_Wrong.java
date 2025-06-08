package easy_1200;

import java.util.Scanner;

public class Right_Left_Wrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            long p[]=new long[n+1];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                p[i+1]=p[i]+a[i];
            }
            String s=sc.next();
            int i=0,j=n-1;
            long ans=0;
            while (i<=j){
                if(s.charAt(i)=='R'){
                    i++;
                    continue;
                }
                if(s.charAt(j)=='L'){
                    j--;
                    continue;
                }
                ans+=p[j+1]-p[i];
                i++;
                j--;
            }
            System.out.println(ans);
        }
    }
}
