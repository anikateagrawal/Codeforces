package easy_800;

import java.util.Scanner;

public class Madoka_and_Strange_Thoughts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int e=n/2;
            int ans=n+e*2+n/3*2;
            System.out.println(ans);
        }
    }
}
