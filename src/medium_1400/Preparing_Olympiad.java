package medium_1400;

import java.util.Scanner;

public class Preparing_Olympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int l=sc.nextInt();
        int r=sc.nextInt();
        int x=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        System.out.println(countcontest(a,l,r,x));
    }
    public static int countcontest(int a[],int l,int r,int x){
        int n=a.length;
        int ans=0;
        for (int i=0;i<(1<<n);i++){
            if(countSetBits(i)>1){
                if(isItPossible(a,l,r,x,i)) ans++;
            }
        }
        return ans;
    }
    public static boolean isItPossible(int a[],int l,int r,int x,int i){
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int pos=0;
        while(i>0){
            if((i&1)>0){
                sum+=a[pos];
                min=Math.min(min,a[pos]);
                max=Math.max(max,a[pos]);
            }
            i>>=1;
            pos++;
        }
        return sum>=l&sum<=r&(max-min)>=x;
    }
    public static int countSetBits(int n){
        int c=0;
        while(n>0){
            c++;
            n=(n&(n-1));
        }
        return c;
    }
}
