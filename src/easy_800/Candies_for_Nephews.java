package easy_800;

import java.util.Scanner;

public class Candies_for_Nephews {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c=3-n%3;
            if(c==3)c=0;
            System.out.println(c);
        }
    }
}
