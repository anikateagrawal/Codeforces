package easy_800;

import java.util.Scanner;

public class Fox_And_Snake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < m; j++) {
                if(i%2==1){
                    System.out.print("#");
                }
                else if(i%4!=0){
                    if(j==m-1)
                    System.out.print("#");
                    else System.out.print(".");
                }
                else {
                    if (j == 0)
                        System.out.print("#");
                    else System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
