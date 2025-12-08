package easy_800;

import java.util.Scanner;

public class Angry_Students {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int k=sc.nextInt();
            String s=sc.next();
            int ans=0;
            int con=Integer.MIN_VALUE;
            for (char ch:s.toCharArray()){
                if(ch=='A'){
                    con=0;
                }
                else {
                    con++;
                    ans=Math.max(ans,con);
                }
            }
            System.out.println(ans);
        }
    }
}
