package easy_1200;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Make_Almost_Equal_With_Mod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long a[]=new long[n];
            for (int i=0;i<n;i++)a[i]=sc.nextLong();

            for (long i=2;;i*=2){
                Set<Long> s=new HashSet<>();
                for (long v:a)s.add(v%i);
                if (s.size()==2) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
