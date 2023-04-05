package contests;

import java.util.Scanner;

public class Insert_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int d=sc.nextInt();
            String s=sc.next();
            int i;
            for ( i= 0; i <n ; i++) {
                if(d>s.charAt(i)-'0'){
                    s=s.substring(0,i)+d+s.substring(i);
                    break;
                }
            }
            if(i==n)s+=d;
            System.out.println(s);
        }

    }
}
