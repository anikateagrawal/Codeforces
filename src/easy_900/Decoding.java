package easy_900;

import java.util.Scanner;

public class Decoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String r="";
        String l="";
        boolean f=false;
        for(int i=n-1;i>=0;i--){
            if(!f){
                r=s.charAt(i)+r;
                f=!f;
            }
            else{
                l+=s.charAt(i);
                f=!f;
            }
        }
        System.out.println(l+r);

    }
}
