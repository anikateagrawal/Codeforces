package easy_800;

import java.util.Scanner;

public class Ideal_Generator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%2==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
