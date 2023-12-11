package easy_1200;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pashmak_and_Garden {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int dx=x2-x1;
        int dy=y2-y1;
        int x3=0,y3=0,x4=0,y4=0;
        if(dx==0){
            x4=x3=x1+dy;
            y3=y1;y4=y2;
        }
        else if(dy==0){
            y3=y4=y1+dx;
            x3=x1;x4=x2;
        }
        else{
            if(Math.abs(dx)!=Math.abs(dy)) {
                System.out.println(-1);
                return;
            }
            x3=x1;y3=y1+dy;
            x4=x2;y4=y2-dy;
        }
        System.out.println(x3+" "+y3+" "+x4+" "+y4);
    }
}
