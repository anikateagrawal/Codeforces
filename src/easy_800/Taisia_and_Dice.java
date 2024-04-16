package easy_800;

import java.util.Scanner;

public class Taisia_and_Dice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt()-1;
            int s=sc.nextInt();
            int r=sc.nextInt();
            int d=s-r;
            int q=r/n;
            int rm=r%n;
            System.out.print(d+" ");
            for (int i=0;i<n;i++){
                if(i<rm) System.out.print((q+1)+" ");
                else System.out.print(q+" ");
            }
            System.out.println();
        }
    }
}
