package easy_900;

import java.util.Scanner;

public class NIT_Destroys_the_Universe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n+1];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int ans=0;int c=0;
            for (int i=0;i<=n;i++){
                if(a[i]==0){
                    if(c>0)ans++;
                    c=0;
                }else c++;
            }
            System.out.println(ans>2?2:ans);
        }
    }
}
