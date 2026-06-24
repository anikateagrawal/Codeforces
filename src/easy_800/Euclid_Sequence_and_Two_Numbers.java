package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Euclid_Sequence_and_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int b[]=new int[n];
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            Arrays.sort(b);
            boolean fl=true;
            for (int i=n-3;i>=0;i--){
                if (b[i]!=b[i+2]%b[i+1])fl=false;
            }
            if (!fl) System.out.println(-1);
            else System.out.println(b[n-1] + " "+b[n-2]);
        }
    }
}
