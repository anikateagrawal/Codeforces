package easy_900;

import java.util.Scanner;

public class Sending_Messages {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long f=sc.nextLong();
            int a=sc.nextInt();
            int b=sc.nextInt();
            boolean fg=true;
            int p=0;
            for (int i=0;i<n;i++){
                int m=sc.nextInt();
                int d=m-p;
                long tt= Math.min(1L*d*a,b);
                if(tt>=f){
                    fg=false;
                }
                else f-=tt;
                p=m;
            }
            if(fg) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
