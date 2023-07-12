package easy_800;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int c=0;
            for (int i = 0; i < 3; i++) {
                if(sc.nextInt()>a)c++;
            }
            System.out.println(c);
        }
    }
}
