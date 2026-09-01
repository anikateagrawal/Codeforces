package easy_900;

import java.util.Scanner;

public class Penchick_and_Satay_Sticks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            boolean p=true;
            for (int i=0;i<n-1;i++){
                if (a[i]>a[i+1] && a[i]-a[i+1]==1){
                    int tmp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=tmp;
                }
            }
            for (int i=0;i<n-1;i++){
                if (a[i]>a[i+1])p=false;
            }
            if (p) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
