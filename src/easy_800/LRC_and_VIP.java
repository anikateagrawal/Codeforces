package easy_800;

import java.util.Scanner;

public class LRC_and_VIP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int max=0,min=Integer.MAX_VALUE;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                max=Math.max(max,a[i]);
                min=Math.min(min,a[i]);
            }
            if(max==min) System.out.println("No");
            else {
                System.out.println("YES");
                for (int i=0;i<n;i++){
                    if(a[i]==max) System.out.print(2+" ");
                    else System.out.print(1+" ");
                }
                System.out.println();
            }
        }
    }
}
