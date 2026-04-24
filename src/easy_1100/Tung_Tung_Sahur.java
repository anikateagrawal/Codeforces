package easy_1100;

import java.util.Scanner;

public class Tung_Tung_Sahur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String p=sc.next();
            String s=sc.next();
            int n=p.length();
            int m=s.length();
            int i=0,j=0;
            int c1=1,c2=1;
            boolean fl=true;
            if (s.charAt(0) != p.charAt(0)){
                System.out.println("NO");
                continue;
            }
            while (i<n && j<m){
                while (i+1<n && p.charAt(i+1) == p.charAt(i)){
                    i++;
                    c1++;
                }
                while (j+1<m && s.charAt(j+1)==s.charAt(j)){
                    j++;
                    c2++;
                }
                if (c2>c1*2 ||c2<c1){
                    fl=false;
                    break;
                }
                i++;j++;
                c1=1;c2=1;
            }
            if (i<n || j<m) fl=false;
            if (fl) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
