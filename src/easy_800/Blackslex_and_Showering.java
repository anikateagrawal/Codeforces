package easy_800;

import java.util.Scanner;

public class Blackslex_and_Showering {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int tot=0;
            for (int i=0;i<n-1;i++)tot+=Math.abs(a[i]-a[i+1]);
            int min=tot-Math.abs(a[1]-a[0]);
            min=Math.min(min,tot-Math.abs(a[n-1]-a[n-2]));
            for (int i=1;i<n-1;i++){
                int v=tot-Math.abs(a[i]-a[i-1])-Math.abs(a[i+1]-a[i])+Math.abs(a[i+1]-a[i-1]);
                min=Math.min(min,v);
            }
            System.out.println(min);
        }
    }
}
