package easy_800;

import java.util.Scanner;

public class Digits_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int nin=n-n/10;
            if(n%10==9)nin--;
            System.out.println(n-nin);
        }
    }
}
