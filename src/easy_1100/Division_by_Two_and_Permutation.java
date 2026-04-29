package easy_1100;

import java.util.Scanner;

public class Division_by_Two_and_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int f[]=new int[n+1];
            for (int i:a){
                while (i>0){
                    if (i<=n && f[i]==0){
                        f[i]++;
                        break;
                    }
                    i/=2;
                }
            }
            boolean fl=true;
            for (int i=1;i<=n;i++){
                if (f[i]==0)fl=false;
            }
            if (fl) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
