package easy_800;

import java.util.Scanner;

public class Required_Remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();int y=sc.nextInt();
            int n=sc.nextInt();
            int r=n%x;
            if(r>=y)n-=(r-y);
            else{
                n-=x+r-y;
            }
            System.out.println(n);
        }
    }
}
