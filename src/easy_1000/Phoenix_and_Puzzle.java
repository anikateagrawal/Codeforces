package easy_1000;

import java.util.Scanner;

public class Phoenix_and_Puzzle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%2==0 && (isPerfect(n)||isPerfect(n/2))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean isPerfect(int n){
        double sqrt=Math.sqrt(n);
        return (int)sqrt==sqrt;
    }
}
