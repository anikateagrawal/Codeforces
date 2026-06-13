package easy_800;

import java.util.Scanner;

public class Woeful_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s=1;
            if (n%2==1){
                System.out.print(s+" ");
                s++;
            }
            for (int i=s;i<=n;i+=2){
                System.out.print((i+1)+" "+(i)+" ");
            }
            System.out.println();
        }
    }
}
