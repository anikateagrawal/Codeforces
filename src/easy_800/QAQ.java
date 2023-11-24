package easy_800;

import java.util.Scanner;

public class QAQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int q=0,qa=0,qaq=0;
        for(char ch:s.toCharArray()){
            if(ch=='Q'){
                qaq+=qa;
                q++;
            }
            else if(ch=='A'){
                qa+=q;
            }
        }
        System.out.println(qaq);
    }
}
