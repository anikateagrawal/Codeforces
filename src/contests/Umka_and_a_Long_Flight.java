package contests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Umka_and_a_Long_Flight {
    static List<Integer> f=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        f.add(1);
        f.add(1);
        for (int i = 0; i < 46; i++) {
            f.add(f.get(i)+f.get(i+1));
        }
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(check(n,x,y)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean check(int n,int x,int y){
        if(n==1)return true;
        if(Math.min(y,f.get(n+1)-y+1)>f.get(n+1)-f.get(n))return false;
        y=Math.min(y,f.get(n+1)-y+1);
        return check(n-1,y,x);
    }
}
