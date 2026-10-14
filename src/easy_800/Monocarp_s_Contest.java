package easy_800;

import java.util.Scanner;

public class Monocarp_s_Contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int c=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if (a[i]==0)c++;
            }
            if (c<2) System.out.println(-1);
            else {
                if (a[0]==0 && a[n-1]==0) System.out.println(0);
                else if (a[0]==0||a[n-1]==0) System.out.println(1);
                else System.out.println(2);
            }
        }
    }
}
