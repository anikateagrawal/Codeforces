package easy_800;

import java.util.Scanner;

public class Sublime_Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int n=sc.nextInt();
            if(n%2==1) System.out.println(x);
            else System.out.println(0);
        }
    }
}
