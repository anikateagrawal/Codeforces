package easy_800;

import java.util.Scanner;

public class YES_or_YES {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next().toLowerCase();
            if(s.equals("yes")) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
