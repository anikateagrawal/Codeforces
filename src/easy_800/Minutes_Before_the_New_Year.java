package easy_800;

import java.util.Scanner;

public class Minutes_Before_the_New_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int m=24*60;
        while (t-->0){
            int h=sc.nextInt()*60;
            h+=sc.nextInt();
            System.out.println(m-h);
        }
    }
}
