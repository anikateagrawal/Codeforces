package easy_800;

import java.util.Scanner;

public class Sum_in_Binary_Tree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            Long n=sc.nextLong();
            long s=0;
            while(n>=1){
                s+=n;
                n/=2;
            }
            System.out.println(s);
        }
    }
}
