package easy_900;

import java.util.Scanner;

public class AB_Balance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char a[]=s.toCharArray();
            if(a[0]!=a[a.length-1]){
                a[0]=a[a.length-1];
            }
            System.out.println(new String(a));
        }
    }
}
