package easy_800;

import java.util.Scanner;

public class Tricky_Template {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            String c=sc.next();
            boolean f=false;
            for(int i=0;i<n;i++){
                char c1=a.charAt(i);
                char c2=b.charAt(i);
                char c3=c.charAt(i);
                if(c3!=c1&&c3!=c2){
                    f=true;
                    break;
                }
            }
            if(f) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
