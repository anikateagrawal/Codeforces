package easy_1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Towers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int ans=1;
        int max=1;
        int c=1;
        for (int i=0;i<n-1;i++){
            if (a[i]==a[i+1]){
                c++;
            }
            else {
                max=Math.max(max,c);
                c=1;
                ans++;
            }
        }
        max=Math.max(max,c);
        System.out.println(max+" "+ans);

    }
}
