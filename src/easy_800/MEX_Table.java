package easy_800;

import java.util.Scanner;

public class MEX_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            System.out.println(Math.max(n,m)+1);
        }
    }
}
