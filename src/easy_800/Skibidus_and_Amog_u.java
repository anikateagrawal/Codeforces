package easy_800;

import java.util.Scanner;

public class Skibidus_and_Amog_u {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            System.out.println(s.substring(0,s.length()-2)+"i");
        }
    }
}
