package easy_1000;

import java.util.Scanner;

public class Best_Binary_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char p='0';
            StringBuilder ans=new StringBuilder();
            for (char ch:s.toCharArray()){
                if (ch=='?'){
                    ans.append(p);
                }
                else {
                    p=ch;
                    ans.append(ch);
                }
            }
            System.out.println(ans);
        }
    }
}
