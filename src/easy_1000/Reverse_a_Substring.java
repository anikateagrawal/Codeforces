package easy_1000;

import java.util.Scanner;

public class Reverse_a_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int in=-1;
        for (int i=0;i<s.length()-1;i++){
            if (s.charAt(i)>s.charAt(i+1)){
                in=i;
                break;
            }
        }
        if (in==-1) System.out.println("NO");
        else {
            System.out.println("YES");
            System.out.println((in+1)+" "+(in+2));
        }
    }
}
