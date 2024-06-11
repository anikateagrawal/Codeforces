package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Tales_of_a_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();;
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[i]=a[i];
            }
            Arrays.sort(b);
            boolean f=true;
            for (int i=n-1;i>=0;i--){
                if(a[i]!=b[i]){
                    System.out.println(b[i]);f=false;break;
                }
            }
            if(f) System.out.println(0);
        }
    }
}
