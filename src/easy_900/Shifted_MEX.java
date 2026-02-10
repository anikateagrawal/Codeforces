package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Shifted_MEX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int max=1;
            int c=1;
            for (int i=1;i<n;i++){
                if(a[i]==a[i-1])continue;
                if(a[i]==a[i-1]+1){
                    c++;
                    max=Math.max(max,c);
                }
                else {
                    c=1;
                }
            }
            System.out.println(max);
        }
    }
}
