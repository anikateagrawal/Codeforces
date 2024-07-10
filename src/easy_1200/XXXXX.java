package easy_1200;

import java.util.Scanner;

public class XXXXX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int max=-1;
            int s=0;
            for (int i=0;i<n;i++){
                s+=a[i];
                if(s%x!=0)max=Math.max(max,i+1);
            }
            s=0;
            for (int i=n-1;i>=0;i--){
                s+=a[i];
                if(s%x!=0)max=Math.max(max,n-i);
            }
            System.out.println(max);
        }
    }
}
