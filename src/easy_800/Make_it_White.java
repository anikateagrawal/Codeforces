package easy_800;

import java.util.Scanner;

public class Make_it_White {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            System.out.println(s.lastIndexOf('B')-s.indexOf('B')+1);
        }
    }
}
