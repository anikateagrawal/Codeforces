package contests;

import java.util.Scanner;

public class MEX_Reordering {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n+1];
            for (int i=0;i<n;i++)a[sc.nextInt()]++;
            if(a[0]==0) System.out.println("No");
            else if (a[0]==1) System.out.println("Yes");
            else if (a[1]>0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
