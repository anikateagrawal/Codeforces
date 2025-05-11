package easy_800;

import java.util.Scanner;

public class Bobritto_Bandito {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(l+" "+(l+m));
        }
    }
}
