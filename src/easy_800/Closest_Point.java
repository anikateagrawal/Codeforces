package easy_800;

import java.util.Scanner;

public class Closest_Point {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int p[]=new int[n];
            for (int i=0;i<n;i++)p[i]=sc.nextInt();
            if(n==2&&p[1]-p[0]!=1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
