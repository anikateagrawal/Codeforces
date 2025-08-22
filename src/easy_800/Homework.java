package easy_800;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String a=sc.next();
            int m=sc.nextInt();
            String b=sc.next();
            String c=sc.next();
            for(int i=0;i<m;i++){
                if(c.charAt(i)=='V'){
                    a=b.charAt(i)+a;
                }
                else {
                    a+=b.charAt(i);
                }
            }
            System.out.println(a);
        }
    }
}
