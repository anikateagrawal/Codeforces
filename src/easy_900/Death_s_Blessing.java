package easy_900;

import java.util.Scanner;

public class Death_s_Blessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[][]=new int[n][2];
            for (int i=0;i<n;i++)a[i][0]=sc.nextInt();
            for (int i=0;i<n;i++)a[i][1]=sc.nextInt();
            int i=0,j=n-1;
            long ans=0;
            while (i<j){
                if (a[i][1]<=a[j][1]){
                    ans+=a[i][0]+a[i][1];
                    i++;
                }
                else {
                    ans+=a[j][0]+a[j][1];
                    j--;
                }
            }
            ans+=a[i][0];
            System.out.println(ans);
        }
    }
}
