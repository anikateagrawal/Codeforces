package easy_1000;

import java.util.Scanner;

public class Pasha_and_Stick {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<6||n%2==1) System.out.println(0);
        else {
            int ans=n/4;
            if(n%4==0)ans--;
            System.out.println(ans);
        }
    }
}
