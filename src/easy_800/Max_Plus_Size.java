package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Plus_Size {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int maxe=0;
            int e=0;
            int maxo=0;
            int o=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(i%2==0){
                    e++;maxe=Math.max(maxe,a[i]);
                }
                else {
                    o++;maxo=Math.max(maxo,a[i]);
                }
            }
            int ans=Math.max(maxe+e,maxo+o);
            System.out.println(ans);
        }
    }
}
