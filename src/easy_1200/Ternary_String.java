package easy_1200;

import java.util.Scanner;

public class Ternary_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int min=Integer.MAX_VALUE;
            String s=sc.next();
            int f[]=new int[3];
            int si=0,ei=0;
            int c=0;
            while (ei<s.length()){
                if(f[s.charAt(ei)-'1']==0)c++;
                f[s.charAt(ei++)-'1']++;
                while(si<ei&&c==3){
                    min=Math.min(min,ei-si);
                    f[s.charAt(si)-'1']--;
                    if(f[s.charAt(si)-'1']==0)c--;
                    si++;
                }
            }
            System.out.println(min==Integer.MAX_VALUE?0:min);
        }
    }
}
