package easy_900;

import java.util.Scanner;

public class Deletive_Editing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String a=sc.next();
            String b=sc.next();
            boolean fl=true;
            int i=a.length()-1,j=b.length()-1;
            boolean used[]=new boolean[a.length()];
            while (i>=0 && j>=0){
                if (a.charAt(i)==b.charAt(j)){
                    used[i]=true;
                    i--;j--;
                }
                else i--;
            }
            if (j>=0)fl=false;
            boolean fr[]=new boolean[26];
            for (i=0;i<used.length;i++){
                char ch=a.charAt(i);
                if (used[i])fr[ch-'A']=true;
                else if (fr[ch-'A']){
                    fl=false;break;
                }
            }
            if (fl) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}