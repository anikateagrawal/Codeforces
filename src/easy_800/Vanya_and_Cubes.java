package easy_800;

import java.util.Scanner;

public class Vanya_and_Cubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=0;
        int l=1;
        int c=1;
        while(t+c<=s){
            l++;
            t+=c;
            c+=l;
        }
        System.out.println(l-1);
    }
}
