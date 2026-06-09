package easy_800;

import java.util.Scanner;

public class Passing_the_Ball {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            boolean arr[]=new boolean[n+1];
            int p=0;
            for (char ch:s.toCharArray()){
                arr[p]=true;
                if (ch=='R'){
                    p++;
                }
                else break;
            }
            int c=0;
            for (boolean i:arr)if (i)c++;
            System.out.println(c);
        }
    }
}
