package easy_800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class The_Secret_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long d=10;
            long c=0;
            List<Long> l=new ArrayList<>();
            while(n/(d+1)>0){
                if(n%(d+1)==0){
                    c++;
                    l.add(0,n/(d+1));
                }
                d*=10;
            }
            System.out.println(c);
            for(long x:l){
                System.out.print(x+" ");
            }
            if(c>0) System.out.println();
        }
    }
}
