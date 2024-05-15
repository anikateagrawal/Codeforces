package easy_800;

import java.util.Scanner;

public class Infinity_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int k=sc.nextInt();
            int sq=(int)Math.sqrt(k);
            if(sq*sq==k) System.out.println(sq+" "+1);
            else {
                int d=k-sq*sq;
                int d2=(sq+1)*(sq+1)-sq*sq;
                int r,c;
                if(d<=d2/2+1){
                    System.out.println(d+" "+(sq+1));
                }
                else {
                    System.out.println((sq+1)+" "+(sq+1-(d-(d2/2+1))));
                }
            }
        }
    }
}
