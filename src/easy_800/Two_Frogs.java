package easy_800;

import java.util.Scanner;

public class Two_Frogs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int d=Math.abs(a-b);
            if(d%2!=0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
