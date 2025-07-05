package easy_800;

import java.util.Scanner;

public class Tournament {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int j=sc.nextInt();
            int k=sc.nextInt();
            int max=0;
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                max=Math.max(max,a[i]);
            }
            if(k>1||max==a[j-1]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
