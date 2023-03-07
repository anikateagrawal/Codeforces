package contests;

import java.util.Scanner;

public class Count_the_Number_of_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int a[]=new int[26];
            int b[]=new int[26];
            for (int i = 0; i < s.length(); i++) {
                char ch=s.charAt(i);
                if(Character.isUpperCase(ch)){
                    a[ch-'A']++;
                }
                else b[ch-'a']++;
            }
            int c=0;
            for (int i = 0; i < 26; i++) {
                int min=Math.min(a[i],b[i]);
                c+=min;
                int d=Math.abs(a[i]-b[i])/2;
                if(d<=k){
                    k-=d;
                    c+=d;
                }
                else {
                    c+=k;
                    k=0;
                }
            }
            System.out.println(c);
        }
    }
}
