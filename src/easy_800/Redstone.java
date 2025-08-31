package easy_800;

import java.util.Scanner;

public class Redstone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int f[]=new int[101];
            boolean flag=false;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                f[a]++;
                if(f[a]>1)flag=true;
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
