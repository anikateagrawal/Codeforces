package easy_900;

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String a[]=s.split("WUB");
        for (String ss:a){
            if(!ss.equals("")) System.out.print(ss+" ");
        }
    }
}
