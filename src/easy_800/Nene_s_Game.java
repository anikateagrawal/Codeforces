package easy_800;

import java.util.Scanner;

public class Nene_s_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int k=sc.nextInt();
            int q=sc.nextInt();
            int a[]=new int[k];
            for (int i=0;i<k;i++)a[i]=sc.nextInt();
            while (q-->0){
                int n=sc.nextInt();
                System.out.print(Math.min(n,a[0]-1)+" ");
            }
            System.out.println();
        }
    }
}
