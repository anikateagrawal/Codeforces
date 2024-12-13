package easy_1200;

import java.util.*;
public class Vlad_and_a_Sum_of_Sum_of_Digits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a[]=new long[200001];

        for(int i=1;i<a.length;i++){
            long sum=0;
            long k=i;
            while(k>0) {
                sum+=k%10;
                k=k/10;
            }
            a[i]=sum+a[i-1];
        }
        int t =sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            System.out.println(a[n]);

        }
    }
}