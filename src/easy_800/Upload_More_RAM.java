package easy_800;

import java.util.Scanner;

public class Upload_More_RAM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            System.out.println((n-1)*k+1);
        }
    }
}
