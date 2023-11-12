package medium_1700;

import java.util.Scanner;

public class Number_of_Ways {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(i>0)a[i]+=a[i-1];
        }
        long ans=0,s=0;
        for(int i=0;i<n-1;i++){
            if(a[i]*3==2*a[n-1])ans+=s;
            if(a[i]*3==a[n-1])s++;
        }
        System.out.println(ans);
    }
}
