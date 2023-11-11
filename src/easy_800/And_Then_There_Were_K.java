package easy_800;

import java.util.Scanner;

public class And_Then_There_Were_K {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int l=0;
            for(int i=0;i<32;i++){
                if((n&(1<<i))>0)l=i;
            }
            System.out.println((1<<l)-1);
        }
    }
}
