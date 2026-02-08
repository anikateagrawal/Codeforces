package easy_900;

import java.util.Scanner;

public class MEX_rose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n+1];
            for (int i=0;i<n;i++){
                a[sc.nextInt()]++;
            }
            int o=0;
            for (int i=0;i<k;i++) {
                if (a[i] == 0) o++;
            }
            System.out.println(Math.max(o,a[k]));
        }
    }
}
