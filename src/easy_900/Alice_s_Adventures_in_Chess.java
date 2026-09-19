package easy_900;

import java.util.*;

public class Alice_s_Adventures_in_Chess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            String s=sc.next();
            List<String> st=new ArrayList<>();
            int x=0,y=0;
            int in=0;
            boolean fl=false;
            while (true){
                st.add(x+" "+y);
                char ch=s.charAt(in);
                in=(in+1)%n;
                if (ch=='N')y++;
                else if (ch=='E')x++;
                else if (ch=='S')y--;
                else x--;
                if (x==a && y==b){
                    fl=true;
                    break;
                }
                if (st.size()>1000)break;
//                System.out.println(st);
            }
            System.out.println(fl?"YES":"NO");
        }
    }
}
