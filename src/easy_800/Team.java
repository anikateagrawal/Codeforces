package easy_800;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=0;
        while (t-->0){
            int s=sc.nextInt()+sc.nextInt()+ sc.nextInt();
            if(s>1)c++;
        }
        System.out.println(c);
    }
}
