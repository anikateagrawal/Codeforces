package easy_800;

import java.util.Scanner;

public class Grass_Field {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int s=0;
            for (int i=0;i<4;i++)s+=sc.nextInt();
            if(s==0) System.out.println(0);
            else if (s==4) System.out.println(2);
            else System.out.println(1);
        }
    }
}
