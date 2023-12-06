package easy_800;

import java.util.Scanner;

public class _2_3_Moves {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n==1) System.out.println(2);
            else if(n%3==0) System.out.println(n/3);
            else System.out.println(n/3+1);
        }
    }
}
