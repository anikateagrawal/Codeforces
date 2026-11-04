package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Souvlaki_VS_Kalamaki {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            boolean fl=true;
            for (int i=1;i<n-1;i+=2){
                if (a[i+1]!=a[i]){
                    fl=false;
                    break;
                }
            }
            if (fl) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
