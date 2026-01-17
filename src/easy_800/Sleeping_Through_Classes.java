package easy_800;

import java.util.Scanner;

public class Sleeping_Through_Classes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int z=0;
            int i=0;
            while (i<s.length()){
                char ch=s.charAt(i++);
                if(ch=='1')i+=k;
                else z++;
            }
            System.out.println(z);
        }
    }
}
