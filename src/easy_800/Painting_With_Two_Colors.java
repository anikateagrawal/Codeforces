package easy_800;

import java.util.Scanner;

public class Painting_With_Two_Colors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(n%2!=b%2) System.out.println("NO");
            else {
                if(n%2!=a%2 && a>b) System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}
