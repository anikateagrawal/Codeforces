package easy_800;

import java.util.Scanner;

public class Kevin_and_Combination_Lock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%33==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
