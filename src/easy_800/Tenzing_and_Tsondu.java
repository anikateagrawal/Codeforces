package easy_800;

import java.util.Scanner;

public class Tenzing_and_Tsondu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            long s1=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                s1+=a[i];
            }
            int b[]=new int[m];
            long s2=0;
            for (int i=0;i<m;i++){
                b[i]=sc.nextInt();
                s2+=b[i];
            }
            if (s1>s2) System.out.println("Tsondu");
            else if (s2>s1) System.out.println("Tenzing");
            else System.out.println("Draw");
        }
    }
}
