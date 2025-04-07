package medium_1400;

import java.util.Map;
import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n==1) System.out.println("FastestFinger");
            else if(n==2||n%2==1) System.out.println("Ashishgup");
            else if((n&(n-1))==0) System.out.println("FastestFinger");
            else {
                int f2=0;
                while (n%2==0){
                    n/=2;f2++;
                }
                boolean p=true;
                for (int i=2;i<= Math.sqrt(n);i++){
                    if (n%i==0){
                        p=false;break;
                    }
                }
                if(f2==1&&!p||f2>1) System.out.println("Ashishgup");
                else System.out.println("FastestFinger");
            }
        }
    }
}
