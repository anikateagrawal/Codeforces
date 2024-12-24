package easy_1000;

import java.util.Scanner;

public class Game_with_Doors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int L=sc.nextInt();
            int R=sc.nextInt();
            int maxl=Math.max(l,L);
            int minr=Math.min(r,R);
            int ans=minr-maxl+2;
            if (ans<=0)ans=1;
            if(l==L&&r==R)ans-=2;
            else if(l==L||r==R)ans-=1;
            System.out.println(ans);
        }
    }
}
