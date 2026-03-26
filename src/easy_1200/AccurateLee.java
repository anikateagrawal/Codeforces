package easy_1200;

import java.util.Scanner;

public class AccurateLee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int i=0;
            StringBuilder z=new StringBuilder("");
            while (i<n && s.charAt(i)=='0')z.append(s.charAt(i++));
            s=s.substring(i);
            int in=s.lastIndexOf('0');
            if(in!=-1)z.append('0');
            in++;
            while (in<s.length())z.append(s.charAt(in++));
            System.out.println(z);

        }
    }
}
