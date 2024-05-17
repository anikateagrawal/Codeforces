package easy_800;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            for (int i=0;i<n;i++)sc.nextInt();
            int r=10-n;
            System.out.println(r*(r-1)/2*6);
        }
    }
}
