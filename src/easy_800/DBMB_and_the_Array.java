package easy_800;

import java.util.Scanner;

public class DBMB_and_the_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            int sum=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            int d=s-sum;
            if(d>=0 && d%x==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
