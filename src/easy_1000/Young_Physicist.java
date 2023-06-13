package easy_1000;

import java.util.Scanner;

public class Young_Physicist {
    public static void main(String[]A){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),x=0,y=0,z=0;
        for(;n-->0;y+=s.nextInt(),z+=s.nextInt())x+=s.nextInt();
        System.out.print(x==0&y==0&z==0?"YES":"NO");
    }

}
