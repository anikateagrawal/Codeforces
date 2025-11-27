package easy_800;

import java.util.Scanner;

public class Minimise_Oneness {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s="1";
            for (int i=0;i<n-1;i++){
                s+="0";
            }
            System.out.println(s);
        }
    }
}
