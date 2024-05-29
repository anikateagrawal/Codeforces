package easy_1000;

import java.util.Scanner;

public class Rudolf_and_121 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            boolean f=true;
            for (int i=1;i<n-1;i++){
                a[i]-=2*a[i-1];
                a[i+1]-=a[i-1];
                a[i-1]=0;
                if(a[i]<0||a[i+1]<0){
                    f=false;
                    break;
                }
            }
            for (int i=0;i<n;i++)if(a[i]>0)f=false;
            if(f) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
