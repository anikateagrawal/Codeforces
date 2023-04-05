package contests;

import java.util.Scanner;

public class Living_Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long k=sc.nextLong();
            long sum=0;
            long mul=1;
            while(k>0){
                long d=k%9;
                sum=sum+d*mul;
                mul*=10;
                k/=9;
            }
//            System.out.println(sum);
            String s=""+sum;
            s=s.replace('8','9');
            s=s.replace('7','8');
            s=s.replace('6','7');
            s=s.replace('5','6');
            s=s.replace('4','5');
            System.out.println(s);

        }
    }

}
