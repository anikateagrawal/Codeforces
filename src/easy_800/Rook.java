package easy_800;

import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String r=sc.next();
            char a=r.charAt(0);
            char b=r.charAt(1);
            for(char i='a';i<='h';i++){
                if(i!=a)
                System.out.println(i+""+b);
            }
            for (int i = 1; i <=8; i++) {
                if(i!=b-'0'){
                    System.out.println(a+""+i);
                }
            }
        }
    }
}
