package easy_900;

import java.util.Scanner;

public class Construct_the_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            String s="";
            char ch='a';
            for(int i=0;i<n;i++){
                s+=(char)(ch+i%a%b);
            }
            System.out.println(s);
        }
    }
}
