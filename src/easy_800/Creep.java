package easy_800;

import java.util.Scanner;

public class Creep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int i=0,j=0;
            while (i<a&& j<b) {
                System.out.print(10);
                i++;
                j++;
            }
            while (i++<a) System.out.print(0);
            while (j++<b) System.out.print(1);
            System.out.println();
        }
    }
}
