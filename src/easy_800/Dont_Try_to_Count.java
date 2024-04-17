package easy_800;

import java.util.Scanner;

public class Dont_Try_to_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String x=sc.next();
            String s=sc.next();
            int c=0;
            while(x.length()<s.length()){
                x+=x;
                c++;
            }
            if(x.contains(s)){
                System.out.println(c);
            }
            else {
                x+=x;
                if(x.contains(s)) System.out.println(c+1);
                else System.out.println(-1);
            }
        }
    }
}
