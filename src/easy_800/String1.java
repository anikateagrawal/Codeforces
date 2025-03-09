package easy_800;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s= sc.next();
            int o=0;
            for (char ch:s.toCharArray()){
                o+=ch-'0';
            }
            System.out.println(o);
        }
    }
}
