package easy_800;

import java.util.Scanner;

public class Domino_on_Windowsill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k1=sc.nextInt();
            int k2=sc.nextInt();
            int w=sc.nextInt();
            int b=sc.nextInt();
            int wp=Math.min(k1,k2);
            int r=k1+k2-2*wp;
            wp+=r/2;
            int k3=n-k1;
            int k4=n-k2;
            int bp=Math.min(k3,k4);
            r=k3+k4-2*bp;
            bp+=r/2;
            if (wp>=w && bp>=b) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
