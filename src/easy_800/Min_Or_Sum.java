package easy_800;

import java.util.Scanner;

public class Min_Or_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int or=0;
            for (int i=0;i<n;i++)or|=sc.nextInt();
            System.out.println(or);
        }
    }
}
