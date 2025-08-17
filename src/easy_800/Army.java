package easy_800;

import java.util.Scanner;

public class Army {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d[]=new int[n+1];
        for (int i=2;i<=n;i++)d[i]=sc.nextInt()+d[i-1];

        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(d[b]-d[a]);
    }
}
