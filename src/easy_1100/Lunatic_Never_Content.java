package easy_1100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lunatic_Never_Content {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            if(n==1) {
                System.out.println(0);
                continue;
            }
            List<Integer> l=new ArrayList<>();
            int i=0,j=n-1;
            while (i<j){
                l.add(Math.abs(a[i]-a[j]));
                i++;j--;
            }
            int gcd=l.get(0);
            for (int k=1;k<l.size();k++){
                gcd=gcd(gcd,l.get(k));
            }
            System.out.println(gcd);
        }
    }
    static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
