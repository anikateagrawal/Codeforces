package easy_1100;

import java.util.Scanner;

public class Yaroslav_and_Permutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[1001];
        int max=0;
        for (int i=0;i<n;i++)a[sc.nextInt()]++;
        for (int i:a){
            max=Math.max(max,i);
        }
        if(max>n/2+n%2) System.out.println("NO");
        else System.out.println("YES");
    }
}
