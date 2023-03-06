package easy_800;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int x=0;
        while (t-->0){
            String s=sc.next();
            if(s.contains("+"))x++;
            else x--;
        }
        System.out.println(x);
    }
}
