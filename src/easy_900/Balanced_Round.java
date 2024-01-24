package easy_900;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Balanced_Round {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int c=1;
            int max=0;
            for(int i=0;i<n-1;i++){
                if(a[i+1]-a[i]<=k){
                    c++;
                }
                else {
                    max= Math.max(max,c);
                    c=1;
                }
            }
            System.out.println(n-Math.max(max,c));
        }
    }
}
