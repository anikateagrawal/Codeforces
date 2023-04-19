package easy_800;

import java.util.Scanner;

public class New_Year_and_Hurry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=240-sc.nextInt();
        int i=1;
        int c=0;
        while(i<=n&&k-i*5>=0){
            c++;
            k-=i*5;
            i++;
        }
        System.out.println(c);
    }
}
