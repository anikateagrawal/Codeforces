package easy_800;

import java.util.Scanner;

public class Sakurako_and_Kosuke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int p=1;
            int x=0;
            while (x>=-n&&x<=n){
                if(p%2==1){
                    x-=(2*p-1);
                }
                else x+=(2*p-1);
                p++;
            }
            if(p%2==0) System.out.println("Sakurako");
            else System.out.println("Kosuke");
        }
    }
}
