package easy_800;

import java.util.Scanner;

public class Three_Piles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int ans=Math.abs(a-b);
            ans=Math.max(ans,Math.abs(a+c-b));
            System.out.println(ans);
        }
    }
}
