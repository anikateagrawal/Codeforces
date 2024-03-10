package easy_900;

import java.util.Scanner;

public class Almost_Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            int f=0;
            int m=i;
            int d=2;
            while(m>1){
                if(m%d==0){
                    f++;
                    while(m%d==0)m/=d;
                }
                else d++;
            }
            if(f==2)c++;
        }
        System.out.println(c);
    }
}
