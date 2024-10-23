package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Jagged_Swaps {
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
            for (int j=0;j<n;j++)
            for (int i=1;i<n-1;i++){
                if(a[i]>a[i-1]&&a[i]>a[i+1]){
                    int tmp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=tmp;
                }
            }
            if(Arrays.equals(a,b)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
