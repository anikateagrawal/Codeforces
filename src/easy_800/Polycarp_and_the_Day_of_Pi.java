package easy_800;

import java.util.Scanner;

public class Polycarp_and_the_Day_of_Pi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String pi="3141592653589793238462643383279";
        while (t-->0){
            String s=sc.next();
            int c=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=pi.charAt(i)) break;
                c++;
            }
            System.out.println(c);
        }
    }
}
