package easy_900;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int in=1;
        if(ch=='R')in=-1;
        String s=sc.next();
        char a[][]=new char[3][10];
        String w[]={"qwertyuiop","asdfghjkl;","zxcvbnm,./"};
        Map<Character,int[]> m=new HashMap<>();
        for (int i=0;i<3;i++){
            for (int j=0;j<10;j++){
                a[i][j]=w[i].charAt(j);
                m.put(w[i].charAt(j),new int[]{i,j});
            }
        }
        String ans="";
        for (int i=0;i<s.length();i++){
            int c[]=m.get(s.charAt(i));
            ans+=a[c[0]][c[1]+in];
        }
        System.out.println(ans);
    }
}
