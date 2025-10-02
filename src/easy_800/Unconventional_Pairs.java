package easy_800;

import java.util.*;
public class Unconventional_Pairs {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int []a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            Arrays.sort(a);
            int min=Integer.MIN_VALUE;
            for(int i=0;i<n;i+=2){
                min=Math.max(min,Math.abs(a[i]-a[i+1]));
            }
            System.out.println(min);
        }
    }
}