package easy_1200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Divisibility_by_2_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int p=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                while (a[i]%2==0){
                    p++;
                    a[i]/=2;
                }
            }
            if (p>=n) System.out.println(0);
            else {
                List<Integer> l=new ArrayList<>();
                for (int i=n;i>=1;i--){
                    int m=i;
                    int pow=0;
                    while (m%2==0){
                        pow++;
                        m/=2;
                    }
                    l.add(pow);
                }
                Collections.sort(l,Collections.reverseOrder());
                int op=0;
                for (int c:l){
                    p+=c;
                    op++;
                    if (p>=n)break;
                }
                if (p>=n)System.out.println(op);
                else System.out.println(-1);
            }
        }
    }
}
