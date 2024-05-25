package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Boats_Competition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int max=0;
            for(int s=0;s<=200;s++){
                max=Math.max(max,pair(a,s));
            }
            System.out.println(max);
        }
    }
    public static int pair(int a[],int s){
        int i=0,j=a.length-1;
        int p=0;
        while (i<j){
            if(a[i]+a[j]==s){
                p++;
                i++;j--;
            }
            else if(a[i]+a[j]>s){
                j--;
            }
            else i++;
        }
        return p;
    }
}
