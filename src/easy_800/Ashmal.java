package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Ashmal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String a[]=new String[n];
            for (int i=0;i<n;i++)a[i]=sc.next();
            Arrays.sort(a,(i1,i2)->(i1+i2).compareTo(i2+i1));
            for (String s:a) System.out.print(s);
            System.out.println();
        }
    }
}
