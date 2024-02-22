package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Reconnaissance_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int m1=-1,m2=-1;
        for(int i=0;i<n;i++){
            int j=(i+1)%n;
            if(Math.abs(a[i]-a[j])<min){
                min=Math.abs(a[i]-a[j]);
                m1=i+1;m2=j+1;
            }
        }
        System.out.println(m1+" "+m2);
    }
}
