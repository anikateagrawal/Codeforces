package easy_800;

import java.util.Scanner;

public class Find_The_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c=0;
            int s=0;
            for(int i=1;;i+=2){
                c++;
                s+=i;
                if(s>=n)break;
            }
            System.out.println(c);
        }
    }
}
