package easy_800;

import java.util.Scanner;

public class Absolute_Cinema {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int b[]=new int[n];
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            int max=0;long sum=0;
            for (int i=0;i<n;i++){
                if(a[i]>b[i]){
                    int tmp=a[i];
                    a[i]=b[i];
                    b[i]=tmp;
                }
                max=Math.max(max,a[i]);
                sum+=b[i];
            }
            System.out.println(max+sum);

        }
    }
}
