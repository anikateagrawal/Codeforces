package easy_800;

import java.util.Scanner;

public class Long_Long {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            long c=0,s=0;
            int i=0;
            while (i<n){
                if(a[i]>=0){
                    s+=a[i++];
                    continue;
                }
                c++;
                s+=-1*a[i++];
                while(i<n&&a[i]<=0){
                    s+=-1*a[i++];
                }
            }
            System.out.println(s+" "+c);
        }
    }
}
