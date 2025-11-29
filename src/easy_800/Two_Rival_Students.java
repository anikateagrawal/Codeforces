package easy_800;

import java.util.Scanner;

public class Two_Rival_Students {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int min=Math.min(a,b);
            int max=Math.max(a,b);
            int ans=max-min;
            int d=(min-1)+(n-max);
            ans+=Math.min(d,x);
            System.out.println(ans);
        }
    }
}
