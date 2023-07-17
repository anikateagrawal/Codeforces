package easy_800;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s1=0,s2=0;
            int p=0;
            while(n>0){
                if(p<3)s1+=n%10;
                else s2+=n%10;
                p++;n/=10;
            }
            if(s1==s2) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
