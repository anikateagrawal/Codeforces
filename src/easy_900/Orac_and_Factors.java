package easy_900;

import java.util.Scanner;

public class Orac_and_Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int f=-1;
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    f=i;break;
                }
            }
            System.out.println(1L*(k-1)*2+f+n);
        }
    }
}
