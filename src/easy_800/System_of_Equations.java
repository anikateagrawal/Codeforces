package easy_800;

import java.util.Scanner;

public class System_of_Equations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        for(int i=0;i<=1000;i++){
            for(int j=0;j<=1000;j++){
                if(i*i+j==n&&i+j*j==m)c++;
            }
        }
        System.out.println(c);
    }
}
