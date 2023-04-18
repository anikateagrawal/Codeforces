package easy_800;

import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=sc.nextInt();
        int max=min;
        int c=0;
        for (int i = 0; i < n-1; i++) {
            int a=sc.nextInt();
            if(a>max){
                max=a;
                c++;
            }
            else if(a<min){
                min=a;
                c++;
            }
        }
        System.out.println(c);
    }
}
