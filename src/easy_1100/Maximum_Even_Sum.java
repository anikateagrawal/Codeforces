package easy_1100;

import java.util.Scanner;

public class Maximum_Even_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long ans=-1;
            if (a%2==1 && b%2==1)ans=(a*b+1);
            else if(a%2==0 && b%2==0)ans=(a*b/2+2);
            else if(b%2==1)ans=-1;
            else {
                long tmp=a*b/2+2;
                if (tmp%2==0)ans=tmp;
                else ans=-1;
            }
            System.out.println(ans);
        }
    }
}
