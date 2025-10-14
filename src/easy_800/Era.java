package easy_800;

import java.util.Scanner;

public class Era {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int max=0;
            for (int i=0;i<n;i++){
                if(a[i]>i+1){
                    int op=a[i]-(i+1);
                    max=Math.max(max,op);
                }
            }
            System.out.println(max);
        }
    }
}
