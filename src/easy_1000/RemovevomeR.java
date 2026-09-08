package easy_1000;

import java.util.Scanner;

public class RemovevomeR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            s=s.replaceAll("0+","0");
            s=s.replaceAll("1+","1");
            if (s.length()==2) System.out.println(2);
            else System.out.println(1);
        }
    }
}
