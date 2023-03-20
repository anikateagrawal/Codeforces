package contests;

import java.util.Arrays;
import java.util.Scanner;

public class Find_and_Replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            System.out.println(fun(s));
        }
    }
    public static String fun(String s){
        int a[]=new int[26];
        Arrays.fill(a,-1);
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'a';
            if(i%2==0){
                if(a[ch]==-1){
                    a[ch]=0;continue;
                }
                else if(a[ch]==1)return "NO";
            }
            else{
                if(a[ch]==-1){
                    a[ch]=1;continue;
                }
                else if(a[ch]==0)return "NO";
            }
        }
        return "YES";
    }
}
