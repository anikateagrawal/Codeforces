package easy_900;

import java.util.Scanner;

public class Yuu_Koito_and_Minimum_Absolute_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            boolean first=false,last=false;
            int ans=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==-1){
                    if(i==0)first=true;
                    if(i==n-1)last=true;
                    a[i]=0;
                }
                if(i>0)ans+=a[i]-a[i-1];
            }
            ans=Math.abs(ans);
            if(first && last){
                first=last=false;
            }
            if(first){
                a[0]=ans;
                ans=0;
            }
            if (last){
                a[n-1]=ans;
                ans=0;
            }
            System.out.println(ans);
            for (int i:a) System.out.print(i+" ");
            System.out.println();

        }
    }
}
