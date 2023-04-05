package contests;

import java.util.Scanner;

public class Conveyor_Belts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x1=sc.nextInt()-1;
            int y1=sc.nextInt()-1;
            int x2=sc.nextInt()-1;
            int y2=sc.nextInt()-1;
            int xx=Math.min(x1,n-x1-1);
            int yy=Math.min(y1,n-y1-1);
            int a=Math.min(xx,yy);
            xx=Math.min(x2,n-x2-1);
            yy=Math.min(y2,n-y2-1);
            int b=Math.min(xx,yy);
            System.out.println(Math.abs(a-b));

        }
    }
}
