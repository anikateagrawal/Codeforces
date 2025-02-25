package easy_1100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paint_the_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<Long> e=new ArrayList<>();
            List<Long> o=new ArrayList<>();
            for (int i=0;i<n;i++){
                if(i%2==0)e.add(sc.nextLong());
                else o.add(sc.nextLong());
            }
            long gcd1=e.get(0);
            long gcd2=o.get(0);
            for (int i=1;i<e.size();i++){
                gcd1=gcd(gcd1,e.get(i));
            }
            for (int i=1;i<o.size();i++){
                gcd2=gcd(gcd2,o.get(i));
            }
            boolean flag=true;
            for (int i=0;i<o.size();i++){
                if(o.get(i)%gcd1==0){
                    flag=false;break;
                }
            }
            if(flag) {
                System.out.println(gcd1);
                continue;
            }
            flag=true;
            for (int i=0;i<e.size();i++){
                if(e.get(i)%gcd2==0){
                    flag=false;
                    break;
                }
            }
            if(flag) {
                System.out.println(gcd2);continue;
            }
            System.out.println(0);
        }
    }
    static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
