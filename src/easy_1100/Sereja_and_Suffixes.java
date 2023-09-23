package easy_1100;

import java.util.HashSet;
import java.util.Scanner;

public class Sereja_and_Suffixes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=sc.nextInt();
        int a[]=new int[n];
        HashSet<Integer> s=new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int b[]=new int[n+1];
        for (int i = n-1; i >=0 ; i--) {
            if(s.contains(a[i]))b[i]=b[i+1];
            else{
                s.add(a[i]);
                b[i]=1+b[i+1];
            }
        }
        for (int i = 0; i < m;i++) {
            int l=sc.nextInt()-1;
            System.out.println(b[l]);
        }
    }
}
