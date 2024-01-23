package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Max_Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
                if(a[i]<b[i]){
                    int tmp=b[i];
                    b[i]=a[i];
                    a[i]=tmp;
                }
            }
            Arrays.sort(a);
            Arrays.sort(b);

            System.out.println(a[n-1]*b[n-1]);
        }
    }
}
