package easy_800;

import java.util.Scanner;

public class Nezzar_and_Colorful_Balls {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int f[]=new int[101];
            int max=0;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                f[a]++;
                max=Math.max(max,f[a]);
            }
            System.out.println(max);
        }
    }
}
