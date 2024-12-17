package easy_800;

import java.util.Scanner;

public class Normal_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String a=sc.next();
            for (int i=a.length()-1;i>=0;i--){
                char ch=a.charAt(i);
                if(ch=='q')ch='p';
                else if(ch=='p')ch='q';
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
