package easy_900;

import java.util.Scanner;

public class Come_Together {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int xa=sc.nextInt();
            int ya=sc.nextInt();
            int xb=sc.nextInt();
            int yb=sc.nextInt();
            int xc=sc.nextInt();
            int yc=sc.nextInt();
            int ans=1;
            int xab=Math.abs(xa-xb);
            int xac=Math.abs(xa-xc);
            int yab=Math.abs(ya-yb);
            int yac=Math.abs(ya-yc);

            if((xb>=xa&&xc>=xa)||(xb<=xa&&xc<=xa)){
                ans+=Math.min(xab,xac);
            }
            if((yb>=ya&&yc>=ya)||(yb<=ya&&yc<=ya)){
                ans+=Math.min(yab,yac);
            }
            System.out.println(ans);
        }
    }
}
