package easy_800;

import java.util.Scanner;

public class Cherry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            long max=1L*a[0]*a[1];
            for(int i=0;i<n-1;i++){
                max=Math.max(max,1L*a[i]*a[i+1]);
            }
            System.out.println(max);
        }
    }
}
