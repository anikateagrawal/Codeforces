package easy_800;

import java.util.Scanner;

public class Madoka_and_Math_Dad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int t1=n/3;
            StringBuilder s=new StringBuilder();
            for (int i=0;i<t1;i++)s.append("21");
            int r=n%3;
            if(r==2)s.append("2");
            else if(r==1)s.insert(0,"1");
            System.out.println(s.toString());
        }
    }
}
