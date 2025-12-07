package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Block_Towers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n-1];
            int t1=sc.nextInt();
            for (int i=0;i<n-1;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            for (int i=0;i<n-1;i++){
                if(a[i]>t1){
                    t1+=(a[i]-t1+1)/2;
                }
            }
            System.out.println(t1);
        }
    }
}
