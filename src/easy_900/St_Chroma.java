package easy_900;

import java.util.Scanner;

public class St_Chroma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int i=0;
            while (i<Math.min(n,x)){
                System.out.print(i+" ");
                i++;
            }
            i++;
            while (i<n){
                System.out.print(i+" ");
                i++;
            }
            if(x<n) System.out.print(x);
            System.out.println();
        }
    }
}
