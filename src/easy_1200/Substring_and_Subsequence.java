package easy_1200;

import java.util.Scanner;
public class Substring_and_Subsequence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t--!=0){
            String a= sc.next();
            String b= sc.next();
            int mx=0;
            int Alen=a.length();
            int Blen=b.length();
            for(int i=0;i<Blen;i++){
                int st=i;
                for(int j=0;j<Alen;j++){
                    if(st<Blen && b.charAt(st)==a.charAt(j))st++;
                }
                mx=Math.max(mx,st-i);
            }
            System.out.println(Alen+Blen-mx);
        }
    }
}