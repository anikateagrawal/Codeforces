package easy_800;

import java.util.Scanner;

public class Floor_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            if(n<=2) System.out.println(1);
            else{
                n-=2;
                System.out.println((n+x-1)/x+1);
            }
        }
    }
}
