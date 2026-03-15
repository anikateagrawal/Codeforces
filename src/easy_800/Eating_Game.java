package easy_800;

import java.util.Scanner;

public class Eating_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int max=0;
            int f[]=new int[11];
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                max=Math.max(max,a);
                f[a]++;
            }
            System.out.println(f[max]);
        }
    }
}
