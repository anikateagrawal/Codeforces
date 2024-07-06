package easy_800;

import java.util.Scanner;

public class Prefiquence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            int i=0,j=0;
            while(i<n&&j<m){
                if(a.charAt(i)==b.charAt(j)){
                    i++;
                    j++;
                }
                else {
                    j++;
                }
            }
            System.out.println(i);
        }
    }
}
