package medium_1600;

import java.util.*;

public class Almost_All_Divisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int d[]=new int[n];
            for (int i=0;i<n;i++)d[i]=sc.nextInt();

            Arrays.sort(d);

            long max=d[n-1],min=d[0];

            long x = max*min;

            TreeSet<Long> divisors = new TreeSet<>();
            for (long i = 2; i * i <= x; i++){
                if(x%i==0){
                    divisors.add(i);
                    if(i!=x/i)divisors.add(x/i);
                }
            }

            if(divisors.size()!=n){
                System.out.println(-1);
                continue;
            }

            boolean valid = true;
            int idx = 0;
            for (long div : divisors) {
                if (div != d[idx++]) {
                    valid = false;
                    break;
                }
            }

            System.out.println(valid ? x : -1);
        }
    }
}
