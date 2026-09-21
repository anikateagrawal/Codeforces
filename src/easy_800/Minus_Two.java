package easy_800;

import java.util.Scanner;

public class Minus_Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int o=0,e1=0,e2=0;
            for (int i:a){
                if (i%2==1)o++;
                else {
                    int d=i/2;
                    if (d%2==1)e1++;
                    else e2++;
                }
            }
            System.out.println(Math.max(o,Math.max(e1,e2)));
        }
    }
}
