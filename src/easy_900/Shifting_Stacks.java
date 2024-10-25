package easy_900;

import java.util.Scanner;

public class Shifting_Stacks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long sum=0;
            for (int i=0;i<n;i++)sum+=sc.nextInt();
            long min=n*(n-1)/2;
            if(sum>=min) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
