package easy_800;

import java.util.Scanner;

public class Destroying_Bridges {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(k>=n-1) System.out.println(1);
            else System.out.println(n);
        }
    }
}
