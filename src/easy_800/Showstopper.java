package easy_800;

import java.util.Scanner;

public class Showstopper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int b[]=new int[n];
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            int min=Math.min(a[n-1],b[n-1]);
            int max=Math.max(a[n-1],b[n-1]);
            boolean possible=true;
            for (int i=0;i<n;i++){
                if(a[i]>min && b[i]>min ||a[i]>max ||b[i]>max)possible=false;
            }
            if (possible) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
