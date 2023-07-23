package easy_800;

import java.util.Scanner;

public class Boring_Apartments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int l=(""+x).length();
            int ans=(x%10-1)*10+l*(l+1)/2;
            System.out.println(ans);
        }
    }
}
