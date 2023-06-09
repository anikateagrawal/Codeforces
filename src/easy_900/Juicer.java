package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Juicer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int d=sc.nextInt();
        int cd=0,c=0;
        for(int i=0;i<n;i++){
            int o=sc.nextInt();
            if(o>b)continue;
            cd+=o;
            if(cd>d){
                c++;
                cd=0;
            }
        }
        System.out.println(c);
    }
}
