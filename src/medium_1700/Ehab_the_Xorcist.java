package medium_1700;

import java.util.Scanner;

public class Ehab_the_Xorcist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long u=sc.nextLong();
        long v=sc.nextLong();
        if(u==0&&v==0) System.out.println(0);
        else if(u==v)
        {
            System.out.println(1);
            System.out.println(u);
        }
        else if(u>v||(v-u)%2!=0) System.out.println(-1);
        else {
            long x=(v-u)/2;
            if(((u)&x)==0) {
                System.out.println(2);
                System.out.println((u+x)+" "+x);
            }
            else{
                System.out.println(3);
                System.out.println(u+" "+x+" "+x);
            }
        }
    }
}
