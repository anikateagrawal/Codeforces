package easy_1100;

import java.util.Scanner;

public class Fedor_and_New_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[m+1];
        for(int i=0;i<m+1;i++)a[i]=sc.nextInt();
        int c=0;
        for(int i=0;i<m;i++){
            if(check(a[i],a[m],k))c++;
        }
        System.out.println(c);
    }
    static boolean check(int a,int b,int k){
        for(int i=0;i<32;i++){
            if((a&(1<<i))>0 && (b&(1<<i))==0 || (a&(1<<i))==0 && (b&(1<<i))>0)k--;
            if(k<0)return false;
        }
        return true;
    }
}
