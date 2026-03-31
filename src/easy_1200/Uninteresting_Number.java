package easy_1200;

import java.util.Scanner;

public class Uninteresting_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int two=0,three=0;
            int sum=0;
            for (char ch:s.toCharArray()){
                if(ch=='2')two++;
                if (ch=='3')three++;
                sum+=ch-'0';
            }
            boolean flag=false;
            outer:
            for (int i=0;i<=two;i++){
                for (int j=0;j<=three;j++){
                    int s2=sum + (i*2 + j*6);
                    if (s2%9==0){
                        System.out.println("YES");
                        flag=true;
                        break outer;
                    }
                }
            }
            if (!flag) System.out.println("NO");
        }
    }
}
