package easy_900;

import java.util.Scanner;

public class Comparison_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int c1=0,c2=0;
            int max=0,max2=0;
            for(char ch:s.toCharArray()){
                if(ch=='<'){
                    c1++;
                    c2=0;
                    max=Math.max(max,c1);
                }
                else {
                    c2++;c1=0;
                    max2=Math.max(max2,c2);
                }
            }
            System.out.println(Math.max(max,max2)+1);
        }
    }
}
