package easy_1000;

import java.util.Scanner;

public class Roof_Construction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int pow=1;
            while (pow<<1<=n-1){
                pow<<=1;
            }
            for (int i=1;i<pow;i++) System.out.print(i+" ");
            System.out.print(0+" ");
            for (int i=pow;i<n;i++) System.out.print(i+" ");
            System.out.println();
        }
    }
}
