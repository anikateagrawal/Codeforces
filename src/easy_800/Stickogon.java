package easy_800;

import java.util.Scanner;

public class Stickogon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int f[]=new int[101];
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                f[a]++;
            }
            int c=0;
            for (int i:f){
                c+=i/3;
            }
            System.out.println(c);
        }
    }
}
