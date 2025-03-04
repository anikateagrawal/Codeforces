package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Mainak_and_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[i]=a[i];
            }
            Arrays.sort(a);
            if(a[0]==b[0]||a[n-1]==b[n-1]){
                System.out.println(a[n-1]-a[0]);
            }
            else {
                int max=b[n-1]-b[0];
                for (int i=0;i<n-1;i++){
                    max=Math.max(max,b[i]-b[i+1]);
                }
                max=Math.max(max,a[n-1]-b[0]);
                max=Math.max(max,b[n-1]-a[0]);
                System.out.println(max);
            }
        }
    }
}
