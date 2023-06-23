package medium_1300;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class T_primes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        Set<Long> prime_sq=new HashSet<>();
        primeseive(prime_sq);
        for(long i:a){
            if(prime_sq.contains(i)) System.out.println("YES");
            else System.out.println("NO");
        }
        System.out.println();
    }
    static void primeseive(Set<Long> prime_sq){
        boolean ar[]=new boolean[1000000];
        ar[0]=ar[1]=true;
        for(int i=2;i<ar.length;i++){
            if(!ar[i]){
                prime_sq.add(1L*i*i);
                for(int j=2;i*j<ar.length;j++){
                    ar[i*j]=true;
                }
            }
        }
    }
}
