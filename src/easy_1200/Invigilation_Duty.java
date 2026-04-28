package easy_1200;

import java.util.Scanner;

public class Invigilation_Duty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        int i=0,j=n-1;
        long s1=0,s2=0;
        long ans=0;
        while (i<=j){
            if (s1<s2){
                s1+=a[i++];
            }
            else if (s1>s2){
                s2+=a[j--];
            }
            else {
                ans=Math.max(ans,s1);
                s1+=a[i++];
            }
        }
        if (s1==s2)ans=Math.max(ans,s1);
        System.out.println(ans);
    }
}
