package easy_1000;

import java.util.Scanner;

public class k_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String s=sc.next();
        int f[]=new int[26];
        for (char ch:s.toCharArray())f[ch-'a']++;
        String ans="";
        for (int i=0;i<26;i++){
            if(f[i]%k!=0){
                ans="-1";
                break;
            }
            else{
                for (int j=0;j<f[i]/k;j++)ans+=(char)(i+'a');
            }
        }
        if(!ans.equals("-1")){
            for (int i=0;i<k;i++) System.out.print(ans);
        }
        else System.out.println(ans);
    }
}
