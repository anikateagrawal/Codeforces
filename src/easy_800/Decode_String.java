package easy_800;

import java.util.Scanner;

public class Decode_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String d="";
            for(int i=0;i<s.length();i++){
                if(i+2<s.length()&&s.charAt(i+2)=='0'){
                    if(i+3<s.length()&&s.charAt(i+3)=='0'){
                        d=d+(char)(s.charAt(i)-'1'+'a');
                    }
                    else{
                        char ch=(char)(Integer.parseInt(s.substring(i,i+2))+'a'-1);
                        d=d+ch;
                        i+=2;
                    }
                }
                else {
                    d=d+(char)(s.charAt(i)-'1'+'a');
                }
            }
            System.out.println(d);
        }
    }
}
