package easy_1000;

import java.util.Scanner;

public class Simple_Repetition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n==1&&k==2) System.out.println("YES");
            else if(k>1) System.out.println("NO");
            else {
                if(prime(n)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
    static boolean prime(int n){
        if(n<=1)return false;
        for (int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
