package easy_800;

import java.util.Scanner;

public class Space_Navigation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int l=0,r=0,u=0,d=0;
            if(x>0)r=x;
            else l=-x;
            if(y>0)u=y;
            else d=-y;
            String s=sc.next();
            for(char ch:s.toCharArray()){
                if(ch=='U')u--;
                else if(ch=='D')d--;
                else if(ch=='L')l--;
                else r--;
            }
            if(u>0||d>0||l>0||r>0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
