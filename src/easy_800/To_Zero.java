package easy_800;

import java.util.Scanner;

public class To_Zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n%2==0){
                k-=k%2;
                System.out.println((n+k-1)/k);
            }
            else {
                if(k%2==0){
                    n-=k-1;
                    System.out.println((n+k-1)/k+1);
                }
                else {
                    n-=k;
                    k--;
                    System.out.println((n+k-1)/k+1);
                }
            }
        }
    }
}
