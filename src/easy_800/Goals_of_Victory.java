package easy_800;

import java.util.Scanner;

public class Goals_of_Victory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long s=0;
            for (int i=0;i<n-1;i++){
                s+=sc.nextInt();
            }
            System.out.println(-1*s);
        }
    }
}
