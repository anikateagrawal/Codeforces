package easy_900;

import java.util.Scanner;

public class Make_Majority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next().replaceAll("0+","0");
//            System.out.println(s);
            int c0=0,c1=0;
            for (char ch:s.toCharArray()){
                if(ch=='0')c0++;
                else c1++;
            }
            if(c0>=c1) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
