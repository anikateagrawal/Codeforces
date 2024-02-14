package easy_800;

import java.util.Scanner;

public class Problemsolving_Log {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[26];
            String s=sc.next();
            for(char ch:s.toCharArray())a[ch-'A']++;
            int c=0;
            for(int i=0;i<26;i++){
                if(a[i]>=i+1)c++;
            }
            System.out.println(c);
        }
    }
}
