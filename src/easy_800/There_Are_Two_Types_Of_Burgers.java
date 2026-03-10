package easy_800;

import java.util.Scanner;

public class There_Are_Two_Types_Of_Burgers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int b=sc.nextInt()/2;
            int p=sc.nextInt();
            int f=sc.nextInt();
            int h=sc.nextInt();
            int c=sc.nextInt();
            if(h>=c){
                int a1=Math.min(p,b);
                b-=a1;
                int a2=Math.min(f,b);
                System.out.println(a1*h+a2*c);
            }
            else {
                int a1=Math.min(f,b);
                b-=a1;
                int a2=Math.min(p,b);
                System.out.println(a1*c+a2*h);
            }
        }
    }
}
