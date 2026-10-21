package easy_900;

import java.util.Scanner;

public class Alice_and_Bob {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int g=0,s=0;
            for (int i=0;i<n;i++){
                int v=sc.nextInt();
                if (v<a) s++;
                else if (v>a)g++;
            }
            if (s>g) System.out.println(a-1);
            else System.out.println(a+1);
        }
    }
}
