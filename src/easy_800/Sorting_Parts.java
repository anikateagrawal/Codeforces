package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Parts {
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
            if(Arrays.equals(a,b)) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
