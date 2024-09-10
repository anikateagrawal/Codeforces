package easy_800;

import java.util.Scanner;

public class Alphabetical_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int st=s.indexOf('a');
            if(st==-1){
                System.out.println("NO");
                continue;
            }
            int en=st;
            boolean flag=true;
            for (int i=1;i<s.length();i++){
                int in=s.indexOf('a'+i);
                if(in==-1){
                    flag=false;
                    break;
                }
                if(in==st-1)st--;
                else if(in==en+1)en++;
                else {
                    flag=false;
                    break;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
