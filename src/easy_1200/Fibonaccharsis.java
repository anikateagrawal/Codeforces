package easy_1200;

import java.util.Scanner;

public class Fibonaccharsis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int st=n/2;
            while(st<=n){
                if(pos(n,k,st))break;
                st++;
            }
            int en=n;
            int lo=st,hi=n;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(pos(n,k,mid)){
                    en=mid;
                    lo=mid+1;
                }
                else hi=mid-1;
            }
            System.out.println(en-st+1);
        }
    }
    static boolean pos(int n,int k,int mid){
        int c=1;
        while(n-mid>=0){
            c++;
            int tmp=mid;
            mid=n-mid;
            n=tmp;
        }
        return c>=k;
    }
}
