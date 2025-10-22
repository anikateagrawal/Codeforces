package easy_800;

import java.util.Scanner;

public class CME {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n==2) System.out.println(2);
            else System.out.println(n%2);
        }
    }
}
