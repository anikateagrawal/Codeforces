package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Removals_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int b[]=new int[n];
            int c[]=new int[n];
            for (int i=0;i<n;i++){
                b[i]=sc.nextInt();
                c[n-i-1]=b[i];
            }
            if (Arrays.equals(a,b) || Arrays.equals(a,c)) System.out.println("Bob");
            else System.out.println("Alice");
        }
    }
}
