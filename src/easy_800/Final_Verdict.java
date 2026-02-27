package easy_800;

import java.util.Scanner;

public class Final_Verdict {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            int sum=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            if ((sum%n)==0 && sum/n==x) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
