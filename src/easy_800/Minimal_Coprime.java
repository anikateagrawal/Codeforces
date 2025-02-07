package easy_800;

import java.util.Scanner;

public class Minimal_Coprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(r==1) System.out.println(1);
            else
            System.out.println(r-l);
        }
    }
}
