package easy_800;

import java.util.Scanner;

public class Two_Permutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==b && a==n) System.out.println("YES");
            else if(a+b+1>=n) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
