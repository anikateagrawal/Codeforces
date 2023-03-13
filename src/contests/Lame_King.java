package contests;

import java.util.Scanner;

public class Lame_King {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=Math.abs(sc.nextInt());
            int b= Math.abs(sc.nextInt());
            int s=2*(Math.min(a,b)+Math.abs(a-b));
            if(Math.abs(a-b)!=0)s-=1;
            System.out.println(s);
        }
    }
}
