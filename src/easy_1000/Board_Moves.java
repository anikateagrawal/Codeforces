package easy_1000;

import java.util.Scanner;

public class Board_Moves {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long m[]=new long[1000000];
        for(int i=1;i<m.length;i++){
            m[i]=8L*i*i+m[i-1];
        }
        while (t-->0){
            int n=sc.nextInt();
            System.out.println(m[n/2]);
        }
    }
}
