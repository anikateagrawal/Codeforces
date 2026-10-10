package easy_800;

import java.util.Scanner;

public class In_Search_of_Convenience {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int R=sc.nextInt();
            System.out.println(x+" "+(y+R));
        }
    }
}
