package easy_800;

import java.util.Scanner;

public class Secret_Sport {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int a=0,b=0;
            for (char ch:s.toCharArray()){
                if (ch=='A')a++;
                else b++;
            }
            if (s.charAt(n-1)=='A') System.out.println("A");
            else System.out.println("B");
        }
    }
}
