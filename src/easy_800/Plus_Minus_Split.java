package easy_800;

import java.util.Scanner;

public class Plus_Minus_Split {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int ng=0,p=0;
            for(char ch:s.toCharArray()){
                if(ch=='+')p++;
                else ng++;
            }
            System.out.println(Math.abs(ng-p));
        }
    }
}
