package easy_800;

import java.util.Scanner;

public class New_Password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        StringBuilder s=new StringBuilder();
        for (int i=0;i<Math.min(n,k);i++) s.append((char)('a'+i));
        char ch=s.charAt(s.length()-1);
        char ch2=s.charAt(s.length()-2);
        for (int i=k;i<n;i+=2){
            s.append(ch2);
            if(i+1<n) s.append(ch);
        }
        System.out.println(s.toString());
    }
}
