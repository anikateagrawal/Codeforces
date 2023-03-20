package contests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Grab_the_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int e=0;
            int o=0;
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
                if(a[i]%2==0)e+=a[i];
                else o+=a[i];
            }
            if(e>o) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
