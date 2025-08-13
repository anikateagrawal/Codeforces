package easy_900;

import java.util.Scanner;

public class Sum_of_Medians {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n*k];
            for (int i=0;i<n*k;i++)a[i]=sc.nextInt();

            long sum=0;
            int in=n*k - ((n)/2)-1;
            for (int i=0;i<k;i++){
                sum+=a[in];
                in-=n/2+1;

            }
            System.out.println(sum);
        }
    }
}
