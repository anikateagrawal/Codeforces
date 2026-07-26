package easy_800;

import java.util.Scanner;

public class Bitwise_Reversion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            boolean fl=true;
            while (x>0 || y>0 || z>0){
                int b1=x%2;
                int b2=y%2;
                int b3=z%2;
                if (b1+b2+b3==2){
                    fl=false;
                    break;
                }
                x>>=1;
                y>>=1;
                z>>=1;
            }
            if (fl) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
