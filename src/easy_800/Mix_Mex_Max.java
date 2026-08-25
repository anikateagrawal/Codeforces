package easy_800;

import java.util.Scanner;

public class Mix_Mex_Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            boolean z=false;
            int m=-1;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if (a[i]==0)z=true;
                m=Math.max(m,a[i]);
            }
            if (z){
                System.out.println("NO");
                continue;
            }
            else {
                boolean f=true;
                for (int i:a){
                    if (i==-1)continue;
                    if (i!=m)f=false;
                }
                if (f) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
