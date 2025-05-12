package easy_800;

import java.util.Scanner;

public class Dora_s_Set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(r-l==2)r++;
            System.out.println((r-l+1)/4);
        }
    }
}
