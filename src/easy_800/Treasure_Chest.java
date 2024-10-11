package easy_800;

import java.util.Scanner;

public class Treasure_Chest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int k=sc.nextInt();
            if(y<=x+k) System.out.println(Math.max(x,y));
            else{
                int time=y+(y-(x+k));
                System.out.println(time);
            }
        }
    }
}
