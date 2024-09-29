package easy_800;

import java.util.*;

public class Too_Min_Too_Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int ans=Math.abs(a[0]-a[n-1])+Math.abs(a[n-1]-a[1])+Math.abs(a[1]-a[n-2])+Math.abs(a[n-2]-a[0]);
            System.out.println(ans);
        }
    }
}
