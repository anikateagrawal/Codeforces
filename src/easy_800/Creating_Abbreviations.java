package easy_800;

import java.util.Scanner;

public class Creating_Abbreviations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String w[]=new String[n];
            for (int i=0;i<n;i++)w[i]=sc.next();
            String a[]=new String[m];
            for (int i=0;i<m;i++)a[i]=sc.next();
            int f[]=new int[26];
            for (String s:w){
                f[s.charAt(0)-'a']++;
            }
            boolean fl=true;
            for (String s:a){
                for (int i=0;i<s.length();i++){
                    char ch=s.charAt(i);
                    if (f[ch-'A']==0){
                        fl=false;
                        break;
                    }
                }
            }
            if (fl) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
