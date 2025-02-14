package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Maria_Breaks_the_Self_isolation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int k=1;
            for (int i=0;i<n;i++){
                if(a[i]<=i+1)k=i+2;
            }
            System.out.println(k);
        }
    }
}
