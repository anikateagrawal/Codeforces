package easy_800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class The_Man_who_became_a_God {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            List<Integer> l =new ArrayList<>();
            for (int i=1;i<n;i++)l.add(Math.abs(a[i]-a[i-1]));
            Collections.sort(l);
            int sum=0;
            for (int i=0;i<n-k;i++)sum+=l.get(i);
            System.out.println(sum);
        }
    }
}
