package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int t=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            t+=a[i];
        }
        Arrays.sort(a);
        int sum=0;int c=0;
        for (int i = n-1; i >=0 ; i--) {
            sum+=a[i];
            c++;
            if(sum>t-sum)break;
        }
        System.out.println(c);
    }
}
