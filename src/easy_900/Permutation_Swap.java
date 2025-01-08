package easy_900;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation_Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            List<Integer> d=new ArrayList<>();
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]!=i+1)d.add(Math.abs(a[i]-i-1));
            }
            int gcd=d.get(0);
            for (int i=2;i<d.size();i++){
                gcd=gcd(gcd,d.get(i));
            }

            System.out.println(gcd);
        }
    }
    static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
