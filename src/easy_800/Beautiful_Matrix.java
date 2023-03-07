package easy_800;

import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int j=0;
        outer:
        for (i = 0; i <5 ;i ++) {
            for(j=0;j<5;j++){
                if(sc.nextInt()==1)break outer;
            }
        }
        System.out.println(Math.abs(2-i)+Math.abs(2-j));
    }
}
