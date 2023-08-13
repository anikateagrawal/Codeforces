package easy_800;

import java.util.Scanner;

public class Brain_s_Photos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n*m;i++){
            char ch=sc.next().charAt(0);
            if(ch!='B'&&ch!='W'&&ch!='G'){
                System.out.println("#Color");
                return;
            }
        }
        System.out.println("#Black&White");
    }
}
