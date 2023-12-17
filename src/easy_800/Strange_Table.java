package easy_800;

import java.util.Scanner;

public class Strange_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            long x=sc.nextLong()-1;
            long r=x%n;
            long c=x/n;
            System.out.println(r*m+c+1);
        }
    }
}
