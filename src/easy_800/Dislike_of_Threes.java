package easy_800;

import java.util.Scanner;

public class Dislike_of_Threes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int k=sc.nextInt();
            int n=0;
            while(k>0){
                n++;
                if(n%10==3||n%3==0)continue;
                k--;
            }
            System.out.println(n);
        }
    }
}
