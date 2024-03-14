package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Parity_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[i]=a[i];
            }
            Arrays.sort(b);
            int i=0;
            for (i=0;i<n;i++){
                if(a[i]%2!=b[i]%2)break;
            }
            if(i==n) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
