package easy_900;

import java.util.Scanner;

public class Chips_Moving {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int o=0,e=0;
        for (int i=0;i<n;i++){
            if(sc.nextInt()%2==0)e++;
            else o++;
        }
        System.out.println(Math.min(o,e));
    }
}
