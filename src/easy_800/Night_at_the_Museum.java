package easy_800;

import java.util.Scanner;

public class Night_at_the_Museum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=0;
        String s=sc.next();
        int m=0;
        for (char ch:s.toCharArray()){
            int v=ch-'a';
            int v2=Math.abs(v-p);
            m+=Math.min(v2,26-v2);
            p=v;
        }
        System.out.println(m);
    }
}
