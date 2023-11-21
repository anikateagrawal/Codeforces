package easy_800;

import java.util.Scanner;

public class Round_Down_the_Price {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int m=sc.nextInt();
            int pow=(int)Math.pow(10,(""+m).length()-1);
            System.out.println(m-pow);
        }
    }
}
