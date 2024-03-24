package easy_800;

import java.util.Scanner;

public class Equalize_Prices_Again {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s=0;
            for (int i=0;i<n;i++){
                s+=sc.nextInt();
            }
            int p=s/n;
            if(s%n!=0)p++;
            System.out.println(p);
        }
    }
}
