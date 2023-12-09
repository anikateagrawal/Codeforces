package easy_800;

import java.util.Scanner;

public class Gregor_and_Cryptography {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        outer:
        while (t-->0){
            int p=sc.nextInt();
            for(int i=2;i<=Math.min(100,p);i++){
                for (int j=i+1;j<=Math.min(100,p);j++){
                    if(p%i==p%j){
                        System.out.println(i+" "+j);
                        continue outer;
                    }
                }
            }
        }
    }
}
