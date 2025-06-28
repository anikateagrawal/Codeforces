package easy_800;

import java.util.Scanner;

public class Equal_Subsequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            for (int i=0;i<n;i++){
                if(i<k) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
        }
    }
}
