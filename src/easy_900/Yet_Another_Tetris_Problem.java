package easy_900;

import java.util.Scanner;

public class Yet_Another_Tetris_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            boolean o=false;boolean e=false;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a%2==0)e=true;
                else o=true;
            }
            if(e&&o) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
