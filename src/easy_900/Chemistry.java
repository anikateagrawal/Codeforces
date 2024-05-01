package easy_900;

import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int f[]=new int[26];
            for (char ch:s.toCharArray())f[ch-'a']++;
            int o=0;
            for(int i=0;i<26;i++)if(f[i]%2==1)o++;
            int min=Math.min(o-1,k);
            k-=min;
            o-=min;
            if(k==0&&o>1){
                System.out.println("NO");
            }
            else System.out.println("YES");

        }
    }
}
