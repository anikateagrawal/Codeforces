package easy_1000;

import java.util.Scanner;

public class Nastia_and_Nearly_Good_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextInt();
            long b=sc.nextInt();

            if(b==1) System.out.println("NO");
            else if(b==2){
                System.out.println("YES");
                System.out.println(a*2+" "+a*3+" "+a*5);
            }
            else{
                System.out.println("YES");
                System.out.println(a+" "+a*(b-1)+" "+a*b);
            }
        }
    }
}
