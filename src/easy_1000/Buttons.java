package easy_1000;

import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        for(int i=0;i<n;i++){
            p+=n-i+(n-i-1)*i;
        }
        System.out.println(p);
    }
}
