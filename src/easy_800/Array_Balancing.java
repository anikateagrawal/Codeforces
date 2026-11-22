package easy_800;

import java.util.Scanner;

public class Array_Balancing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int b[]=new int[n];
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            for (int i=0;i<n;i++){
                if (b[i]<a[i]){
                    int tmp=a[i];
                    a[i]=b[i];
                    b[i]=tmp;
                }
            }
            int sum=0;
            for (int i=0;i<n-1;i++){
                sum+=Math.abs(a[i]-a[i+1]);
                sum+=Math.abs(b[i]-b[i+1]);
            }
            System.out.println(sum);
        }
    }
}
