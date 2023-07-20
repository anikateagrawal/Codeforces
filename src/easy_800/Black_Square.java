package easy_800;

import java.util.Scanner;

public class Black_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        for(int i=0;i<4;i++)a[i]=sc.nextInt();
        int sum=0;
        String s=sc.next();
        for(char ch:s.toCharArray()){
            sum+=a[ch-'1'];
        }
        System.out.println(sum);
    }
}
