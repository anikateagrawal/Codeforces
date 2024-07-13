package easy_800;

import java.util.Scanner;

public class Verify_Password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            boolean f=true;
            int n=sc.nextInt();
            String s=sc.next();
            char p=0;
            for (char ch:s.toCharArray()){
                if(!Character.isLetterOrDigit(ch)||ch<p){
                    f=false;break;
                }
                p=ch;
            }
            if(f) System.out.println("YES");else System.out.println("NO");

        }
    }
}
