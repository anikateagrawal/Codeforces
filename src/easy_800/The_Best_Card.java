package easy_800;

import java.util.Scanner;

public class The_Best_Card {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt()+1;
            if (check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean check(int n){
        for (int i=2;i*i<=n;i++)if (n%i==0)return false;
        return true;
    }
}
