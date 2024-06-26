package easy_800;

import java.util.Scanner;

public class Number_Transformation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();int y=sc.nextInt();
            if(y%x!=0){
                System.out.println(0+" "+0);
                continue;
            }
            int z=y/x;
            if(z==1) {
                System.out.println(1+" "+1);
                continue;
            }
            boolean f=false;
            for(int  b=1;b<=z;b++){
                double d=Math.log10(z)/Math.log10(b);
                if(d==(int)d){
                    f=true;
                    System.out.println((int)d+" "+b);
                    break;
                }
            }
            if(!f) System.out.println(0+" "+0);
        }
    }
}
