package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Prime_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        boolean prime[]=new boolean[100001];
        sieve(prime);
        while (t-->0){
            int n=sc.nextInt();
            int v=-1;
            for (int i=2;i<prime.length;i++){
                if(!prime[i])continue;
                if((i-1)%(n-1)==0 && !prime[(i-1)/(n-1)]){
                    v=(i-1)/(n-1);
                    break;
                }
            }
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    if(i==j) System.out.print(1+" ");
                    else System.out.print(v+" ");
                }
                System.out.println();
            }
        }
    }
    static void sieve(boolean prime[]){
        Arrays.fill(prime,true);
        prime[0]=prime[1]=false;
        for (int i=2;i<prime.length;i++){
            if(prime[i]){
                for (int j=2;j*i<prime.length;j++){
                    prime[j*i]=false;
                }
            }
        }
    }
}
