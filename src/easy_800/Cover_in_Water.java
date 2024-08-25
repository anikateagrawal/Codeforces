package easy_800;

import java.util.Scanner;

public class Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next()+"#";
            int m=0;
            boolean three=false;
            int c=0;
            for (char ch:s.toCharArray()){
                if(ch=='#')c=0;
                else {
                    c++;
                    if(c==3)three=true;
                    m++;
                }
            }
            if(three)m=2;
            System.out.println(m);
        }
    }
}
