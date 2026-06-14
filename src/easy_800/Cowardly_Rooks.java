package easy_800;

import java.util.Scanner;

public class Cowardly_Rooks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            for (int i=0;i<m;i++){
                int x=sc.nextInt();
                int y=sc.nextInt();
            }
            if (m==n) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
