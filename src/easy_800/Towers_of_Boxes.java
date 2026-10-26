package easy_800;

import java.util.Scanner;

public class Towers_of_Boxes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int d=sc.nextInt();
            int c=d/m;
            int div = c+1;
            int ans = (n+div-1)/div;
            System.out.println(ans);
        }
    }
}
