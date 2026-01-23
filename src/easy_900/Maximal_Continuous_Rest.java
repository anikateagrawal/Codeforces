package easy_900;

import java.util.Scanner;

public class Maximal_Continuous_Rest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        int c=0,max=0;
        for (int i=0;i<2*n;i++){
            int in=i%n;
            if(a[in]==1){
                c++;
                max=Math.max(max,c);
            }
            else c=0;
        }
        System.out.println(max);
    }
}
