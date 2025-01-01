package easy_800;

import java.util.Scanner;

public class Ambitious_Kid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            ans=Math.min(ans,Math.abs(a));
        }
        System.out.println(ans);
    }
}
