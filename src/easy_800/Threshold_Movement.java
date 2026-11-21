package easy_800;

import java.util.Scanner;

public class Threshold_Movement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            boolean fl=true;
            if (n%2==1 || n==1){
                System.out.println("NO");
                continue;
            }
            int max=a[0],min=a[1];
            for (int i=2;i<n-1;i+=2){
                if (a[i]<=a[i+1]){
                    fl=false;
                    break;
                }
                max=Math.min(max,a[i]);
                min=Math.max(min,a[i+1]);
            }
            if (max<=min+1)fl=false;
//            System.out.println(max+" "+min);
            System.out.println(fl?"YES":"NO");
        }
    }
}
