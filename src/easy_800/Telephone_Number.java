package easy_800;

import java.util.Scanner;

public class Telephone_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int in=s.indexOf('8');
            if (in==-1 || n-in<11) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
