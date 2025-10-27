package easy_800;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int ans=s.charAt(s.length()-1)-'0';
            for (int i=s.length()-2;i>=0;i--){
                int d=s.charAt(i)-'0';
                if(d==0)continue;
                ans+=d+1;
            }
            System.out.println(ans);
        }
    }
}
