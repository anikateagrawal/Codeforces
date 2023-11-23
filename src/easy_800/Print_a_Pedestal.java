package easy_800;

import java.util.Scanner;

public class Print_a_Pedestal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int f=n/3+1;
            int s=n/3;
            int th=n/3-1;
            if(n%3==1)f++;
            else if(n%3==2){
                f++;s++;
            }
            System.out.println(s+" "+f+" "+th);
        }
    }

}
