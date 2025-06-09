package questions.week1;

import java.util.Scanner;

public class Max_and_Min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int min=Math.min(a,Math.min(b,c));
        int max=Math.max(a,Math.max(b,c));
        System.out.println(min+" "+max);
    }
}
