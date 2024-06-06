package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Choosing_Cubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int f=sc.nextInt();int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            f=a[f-1];
            Arrays.sort(a);
            if(a[n-k]>f) System.out.println("NO");
            else if(a[n-k]<f) System.out.println("YES");
            else {
                if(n-k>0&&a[n-k-1]==f) System.out.println("Maybe");
                else System.out.println("YES");
            }
        }
    }
}
