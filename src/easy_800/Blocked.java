package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Blocked {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int f[]=new int[101];
            boolean fl=false;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                f[a[i]]++;
                if (f[a[i]]>1){
                    fl=true;
                }
            }
            if (fl) System.out.println(-1);
            else {
                Arrays.sort(a);
                for (int i=n-1;i>=0;i--) System.out.print(a[i]+" ");
                System.out.println();
            }

        }
    }
}
