package easy_800;

import java.util.Scanner;

public class Distanced_Coloring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            n=Math.min(n,k);
            m=Math.max(m,k);
            System.out.println(n*m);
        }
    }
}
