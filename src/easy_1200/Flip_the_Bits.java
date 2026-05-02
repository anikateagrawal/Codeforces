package easy_1200;

import java.util.Scanner;

public class Flip_the_Bits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            int z=0,o=0;
            boolean fl=true;
            boolean pr=true;
            outer:
            for (int i=0;i<n;i++){
                boolean curr=a.charAt(i)==b.charAt(i);
                if (curr==pr){
                    if (a.charAt(i)=='0')z++;else o++;
                }
                else {
                    if (z!=o){
                        fl=false;
                        break ;
                    }
                    if (a.charAt(i)=='0')z++;else o++;
                    pr=curr;
                }
            }
            if (pr==false && z!=o)fl=false;
            if (fl) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
