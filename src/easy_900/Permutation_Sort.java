package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation_Sort {
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
            Arrays.sort(b);
            if(Arrays.equals(a,b)) System.out.println(0);
            else if(a[0]==b[0]||b[n-1]==a[n-1]) System.out.println(1);
            else {
                if(a[0]==b[n-1] && a[n-1]==b[0]) System.out.println(3);
                else
                System.out.println(2);
            }
        }
    }
}
