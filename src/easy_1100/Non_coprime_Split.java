package easy_1100;

import java.util.Scanner;

public class Non_coprime_Split {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(r<4) System.out.println(-1);
            else if(r%2==0){
                System.out.println(r/2+" "+(r/2));
            }
            else if(r>l){
                r--;
                System.out.println(r/2+" "+(r/2));
            }
            else {
                int f=prime(r);
                if(f==-1) System.out.println(-1);
                else {
                    System.out.println(f+" "+(r-f));
                }
            }
        }
    }
    static int prime(int n){
        for (int i=2;i*i<=n;i++){
            if(n%i==0)return i;
        }
        return -1;
    }
}
