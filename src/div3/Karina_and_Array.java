package div3;

import java.util.Arrays;
import java.util.Scanner;

public class Karina_and_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++)a[i]=sc.nextLong();
            Arrays.sort(a);
            System.out.println(Math.max(1L*a[0]*a[1],1L*a[n-1]*a[n-2]));
        }
    }
}
