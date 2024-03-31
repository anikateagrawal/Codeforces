package easy_800;

import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int min=Integer.MAX_VALUE;
            for (int i=0;i<n-1;i++){
                if(a[i]>a[i+1]){
                    min=0;break;
                }
                else {
                    int d=a[i+1]-a[i];
                    min=Math.min(min,d/2+1);
                }
            }
            System.out.println(min);
        }
    }
}
