package easy_900;

import java.util.Scanner;

public class Delete_from_the_Left {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int i=0,j=0;
        while (a.charAt(a.length()-i-1)==b.charAt(b.length()-j-1)){
            i++;j++;
        }
        System.out.println(a.length()+b.length()-i-j);
    }
}
