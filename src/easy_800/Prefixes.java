package easy_800;

import java.util.Scanner;

public class Prefixes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        char a[]=s.toCharArray();
        int c=0;
        for (int i=0;i<n;i+=2){
            if (a[i]==a[i+1]){
                c++;
                a[i]=a[i]=='a'?'b':'a';
            }
        }
        System.out.println(c);
        System.out.println(new String(a));
    }
}
