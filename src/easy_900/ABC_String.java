package easy_900;

import java.util.Scanner;

public class ABC_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int n=s.length();
            if (s.charAt(0) == s.charAt(n-1)) System.out.println("NO");
            else {
                char o=s.charAt(0);
                char c=s.charAt(n-1);
                int b=0;
                for (char ch:s.toCharArray()){
                    if (ch==o)b++;
                    else if(ch==c)b--;
                    else b++;
                    if (b<0)break;
                }
                if (b==0){
                    System.out.println("YES");
                    continue;
                }
                b=0;
                for (char ch:s.toCharArray()){
                    if (ch==o)b++;
                    else if(ch==c)b--;
                    else b--;
                    if (b<0)break;
                }
                if (b==0) System.out.println("YES");
                else System.out.println("NO");

            }
        }
    }
}
