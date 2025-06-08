package easy_1200;

import java.util.Scanner;

public class Right_Left_Wrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
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
                ans+=score(i,j,a);
                i++;
                j--;
            }
            System.out.println(ans);
        }
    }
    static long score(int l,int r,int a[]){
        long ans=0;
        while (l<=r){
            ans+=a[l++];
        }
        return ans;
    }
}
