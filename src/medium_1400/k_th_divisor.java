package medium_1400;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class k_th_divisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int k=sc.nextInt();
        List<Long> d=new ArrayList<>();
        for (int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i!=n/i){
                    d.add(n/i);
                }
                d.add(i*1L);
            }
        }
        Collections.sort(d);
        if(d.size()<k) System.out.println(-1);
        else System.out.println(d.get(k-1));
    }
}
