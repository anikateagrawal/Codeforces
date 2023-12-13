package easy_800;

import java.util.Scanner;

public class Rudolph_and_Cut_the_Rope {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                if(b<a)c++;
            }
            System.out.println(c);
        }
    }
}
