package easy_800;

import java.util.Scanner;

public class Mezo_Playing_Zoma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=0,r=0;
        String s=sc.next();
        for(char ch:s.toCharArray()){
            if(ch=='L')l--;
            else r++;
        }
        System.out.println(r-l+1);
    }
}
