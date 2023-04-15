package easy_800;

import java.util.Scanner;

public class Candies_and_Two_Sisters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n<3) System.out.println(0);
            else System.out.println((n+1)/2-1);
        }
    }
}
