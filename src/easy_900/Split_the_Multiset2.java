package easy_900;

import java.util.Scanner;

public class Split_the_Multiset2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int op=(n+k-3)/(k-1);
            System.out.println(op);
        }
    }
}
