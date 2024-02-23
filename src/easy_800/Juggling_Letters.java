package easy_800;

import java.util.Scanner;

public class Juggling_Letters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int f[]=new int[26];
            for(int i=0;i<n;i++){
                String s=sc.next();
                for(char ch:s.toCharArray())f[ch-'a']++;
            }
            boolean ff=true;
            for(int i=0;i<26;i++){
                if(f[i]%n!=0)ff=false;
            }
            if(ff) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
