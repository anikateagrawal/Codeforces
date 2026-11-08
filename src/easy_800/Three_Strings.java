package easy_800;

import java.util.Scanner;

public class Three_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String a=sc.next();
            String b=sc.next();
            String c=sc.next();
            boolean f=true;
            for (int i=0;i<a.length();i++){
                char c1=a.charAt(i);
                char c2=b.charAt(i);
                char c3=c.charAt(i);
                if (c2!=c3 && c1!=c3){
                    f=false;
                    break;
                }
            }
            if (f) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
