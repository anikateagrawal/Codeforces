package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Quality_vs_Quantity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int i=2,j=n-2;
            long sl=a[0]+a[1];
            long sr=a[n-1];
            while (i<j && sl>=sr){
                sl+=a[i];
                sr+=a[j];
                i++;j--;
            }
            if(sr>sl) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
