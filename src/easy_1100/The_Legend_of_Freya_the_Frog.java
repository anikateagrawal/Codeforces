package easy_1100;

import java.util.Scanner;

public class The_Legend_of_Freya_the_Frog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int k=sc.nextInt();
            int mx=(x+k-1)/k;
            int my=(y+k-1)/k;
            int min=Math.min(mx,my);
            int moves=min+(mx+my-2*min);
            moves*=2;
            if(mx>my)moves--;
            System.out.println(moves);
        }
    }
}
