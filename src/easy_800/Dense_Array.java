package easy_800;

import java.util.Scanner;

public class Dense_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int c=0;
            for(int i=0;i<n-1;i++){
                int min=Math.min(a[i],a[i+1]);
                int max=Math.max(a[i],a[i+1]);
                while(max>2*min){
                    c++;
                    max=(max+1)/2;
                }
            }
            System.out.println(c);
        }
    }
}
