package medium_1400;

import java.util.Scanner;

public class I_Hate_1111 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n>=n%11*111) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
