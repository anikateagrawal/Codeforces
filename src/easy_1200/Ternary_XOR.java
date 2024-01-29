package easy_1200;

import java.util.Scanner;

public class Ternary_XOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String x=sc.next();
            String a="";
            String b="";
            boolean f=false;
            for(char ch:x.toCharArray()){
                if(ch=='2'){
                    if(f){
                        a+="0";
                        b+="2";
                    }
                    else {
                        a+="1";b+="1";
                    }
                }
                else if(ch=='0'){
                    a+="0";b+="0";
                }
                else{
                    if(f){
                        a+="0";
                        b+="1";
                    }
                    else {
                        f=true;
                        a+="1";b+="0";
                    }
                }
            }
            System.out.println(a);
            System.out.println(b);
        }
    }
}
