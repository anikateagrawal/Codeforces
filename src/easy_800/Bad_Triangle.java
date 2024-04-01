package easy_800;

import java.util.Scanner;

public class Bad_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long a[]=new long[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            if(a[0]+a[1]<=a[n-1]){
                System.out.println(1+" "+2+" "+n);
            }
            else System.out.println(-1);
        }
    }
}
