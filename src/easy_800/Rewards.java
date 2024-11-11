package easy_800;

import java.util.Scanner;

public class Rewards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt()+sc.nextInt()+sc.nextInt();
        int m=sc.nextInt()+sc.nextInt()+sc.nextInt();
        int n=sc.nextInt();

        int r=(c+4)/5+(m+9)/10;
        if(r<=n) System.out.println("YES");
        else System.out.println("NO");
    }
}
