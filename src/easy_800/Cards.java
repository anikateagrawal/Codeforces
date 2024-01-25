package easy_800;

import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int one=0;int z=0;
        for(char ch:s.toCharArray()){
            if(ch=='n')one++;
            else if(ch=='z')z++;
        }
        while (one-->0) System.out.print(1+" ");
        while (z-->0) System.out.print(0+" ");
    }
}
