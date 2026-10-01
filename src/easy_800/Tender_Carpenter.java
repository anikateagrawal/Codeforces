package easy_800;

import java.util.Scanner;

public class Tender_Carpenter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            boolean f=false;
            for (int i=0;i<n-1;i++){
                if (2*a[i]>a[i+1] && 2*a[i+1]>a[i]){
                    f=true;
                    break;
                }
            }
            if (f) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
