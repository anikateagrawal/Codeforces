package easy_800;

import java.util.Scanner;

public class Luntik_and_Concerts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt()%2;
            int b=sc.nextInt()%2;
            int c=sc.nextInt()%2;
            long tot= 0L+a+b*2+c*3;
            System.out.println(tot%2);
        }
    }
}
