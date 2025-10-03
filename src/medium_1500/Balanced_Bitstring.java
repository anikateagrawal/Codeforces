package medium_1500;

import java.util.Scanner;

public class Balanced_Bitstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            if(check(s,n,k)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static  boolean check(String s, int n, int k){
        char ch[]=s.toCharArray();
        for(int i=k;i<n;i++) {
            if(ch[i]!=ch[i%k]) {
                if(ch[i%k]=='?') {
                    ch[i%k]=ch[i];
                }else if(ch[i]=='?') {
                    ch[i]=ch[i%k];
                }else {
                    return false;
                }
            }
        }
        int zero=0,one=0;
        for(int i=0;i<k;i++) {
            if(ch[i]=='0') {
                zero++;
            }else if(ch[i]=='1') {
                one++;
            }
        }
        if(one>k/2||zero>k/2)return false;
        return true;
    }
}
