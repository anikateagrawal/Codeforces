package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Choosing_Teams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int c=0;
        for (int i = 2; i < n; i+=3) {
            if(5-a[i]>=k)c++;
        }
        System.out.println(c);
    }
}
