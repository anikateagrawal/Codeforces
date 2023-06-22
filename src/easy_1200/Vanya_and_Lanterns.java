package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Vanya_and_Lanterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int max=(a[0]-0)*2;
        for(int i=1;i<n;i++){
            max=Math.max(max,a[i]-a[i-1]);
        }
        max=Math.max(max,(l-a[n-1])*2);
        System.out.println(String.format("%.10f",max*1.0/2));
    }
}
