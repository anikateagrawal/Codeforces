package easy_800;

import java.util.Scanner;

public class Hall_of_Fame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            if(s.contains("RL")) System.out.println(0);
            else  if(s.contains("LR")) System.out.println(s.indexOf("LR")+1);
            else System.out.println(-1);
        }
    }
}
