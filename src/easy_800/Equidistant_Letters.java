package easy_800;

import java.util.Scanner;

public class Equidistant_Letters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String d="",s="";
            String ss=sc.next();
            int f[]=new int[26];
            for(char ch:ss.toCharArray())f[ch-'a']++;
            for(int i=0;i<26;i++){
                if(f[i]==0)continue;
                if(f[i]==2){
                    d+=(char)(i+'a');
                    d+=(char)(i+'a');
                }
                else s+=(char)(i+'a');
            }
            System.out.println(d+s);
        }
    }
}
