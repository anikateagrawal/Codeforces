package easy_800;

import java.util.Scanner;

public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        String s=sc.next();
        for (int i = 0; i < t; i++) {
            for(int j=0;j<s.length()-1;j++){
                if(s.charAt(j)=='B'&&s.charAt(j+1)=='G'){
                    s=s.substring(0,j)+"GB"+s.substring(j+2);
                    j++;
                }
            }
        }
        System.out.println(s);
    }
}
