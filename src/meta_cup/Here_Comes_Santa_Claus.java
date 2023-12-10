package meta_cup;

import java.util.Arrays;
import java.util.Scanner;

public class Here_Comes_Santa_Claus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++){
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            Arrays.sort(a);
            double m1=0;
            if(n==5){
                double m2=(a[n-1]+a[n-2])/2-(a[0]+a[2])/2;
                double m3=(a[n-1]+a[n-3])/2-(a[0]+a[1])/2;
                m1=Math.max(m1,Math.max(m2,m3));
            }
            else{
                m1=(a[n-1]+a[n-2])/2-(a[1]*1.0+a[0])/2;
            }
            System.out.println("Case #"+j+": "+m1);
        }
    }
}
