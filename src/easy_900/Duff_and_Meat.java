package easy_900;

import java.util.Scanner;

public class Duff_and_Meat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for (int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        int ans=0,min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            min=Math.min(min,a[i][1]);
            ans+=a[i][0]*min;
        }
        System.out.println(ans);
    }
}
