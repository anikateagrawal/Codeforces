package easy_800;

import java.util.Scanner;

public class Crossmarket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int min=Math.min(n,m);
            int max=Math.max(n,m);
            int ans=min*2+max-2;
            if(n==1 && m==1)ans--;
            System.out.println(ans);
        }
    }
}
