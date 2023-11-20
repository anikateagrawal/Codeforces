package easy_800;

import java.util.Scanner;

public class Colorful_Stones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String c=sc.next();
        int p=1;
        for(int i=0;i<c.length();i++){
            if(s.charAt(p-1)==c.charAt(i)){
                p++;
            }
        }
        System.out.println(p);
    }
}
