package easy_900;

import java.util.Scanner;

public class Split_the_Multiset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();int k=sc.nextInt();
            if(n==1){
                System.out.println(0);continue;
            }
            int r=n-k;
            int d=(r+k-2)/(k-1);
            System.out.println(d+1);
        }
    }
}
