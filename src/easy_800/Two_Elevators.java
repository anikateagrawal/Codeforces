package easy_800;

import java.util.Scanner;

public class Two_Elevators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int t1=a-1;
            int t2=Math.abs(b-c)+c-1;
            if(t1<t2) System.out.println(1);
            else if(t2<t1) System.out.println(2);
            else System.out.println(3);
        }
    }
}
