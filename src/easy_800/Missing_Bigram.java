package easy_800;

import java.util.Scanner;

public class Missing_Bigram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String word[]=new String[n-2];
            for (int i=0;i<word.length;i++)word[i]=sc.next();
            String ans=word[0];
            boolean flag=false;
            for (int i=0;i<word.length-1;i++){
                if(word[i].charAt(1)==word[i+1].charAt(0)){
                    ans+=word[i+1].charAt(1);
                }
                else{
                    flag=true;
                    ans+=word[i+1];
                }
            }
            if(!flag)ans+="a";
            System.out.println(ans);
        }
    }
}
