package easy_1000;

import java.util.Scanner;

public class Different_Differences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int k=sc.nextInt();
            int n=sc.nextInt();
            int p=1;
            System.out.print(p+" ");
            for (int i=1;i<k;i++){
                if(p+i+(k-i-1)<= n){
                    p+=i;
                    System.out.print(p+" ");
                }
                else {
                    p++;
                    System.out.print(p+" ");
                }
            }
            System.out.println();
        }
    }
}
