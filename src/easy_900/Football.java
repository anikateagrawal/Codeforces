package easy_900;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int z=0,o=0;
        String s=sc.next();
        boolean d=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                o=0;
                z++;
            }
            else {
                z=0;
                o++;
            }
            if(z>=7||o>=7){
                d=true;
                break;
            }
        }
        if(d) System.out.println("YES");
        else System.out.println("NO");
    }
}
