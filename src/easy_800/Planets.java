package easy_800;

import java.util.Scanner;

public class Planets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c=sc.nextInt();
            int f[]=new int[101];
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                f[a]++;
            }
            int ans=0;
            for (int i:f){
                ans+=Math.min(i,c);
            }
            System.out.println(ans);
        }
    }
}
