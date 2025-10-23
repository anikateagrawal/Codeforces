package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Select_Three_Sticks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int min=Integer.MAX_VALUE;
            for (int i=1;i<n-1;i++){
                int op=a[i]-a[i-1]+ a[i+1]-a[i];
                min=Math.min(min,op);
            }
            System.out.println(min);
        }
    }
}
