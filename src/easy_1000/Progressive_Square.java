package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Progressive_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int b[]=new int[n*n];
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n*n;i++){
                int v=sc.nextInt();
                b[i]=v;
                min=Math.min(min,v);
            }
            int a[]=new int[n*n];
            int k=0;
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    a[k++]=min+i*c+j*d;
                }
            }
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
