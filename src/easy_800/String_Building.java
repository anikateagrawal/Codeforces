package easy_800;

import java.util.Scanner;

public class String_Building {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int c=1;
            boolean flag=true;
            for (int i=1;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(i-1)){
                    if(c==1){
                        flag=false;
                        break;
                    }
                    c=1;
                }
                else c++;
            }
            if(c==1)flag=false;
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
