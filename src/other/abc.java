package other;

import java.util.*;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String n=sc.next();
            int sum=0;
            int two=0,three=0;
            for(char ch:n.toCharArray()){
                sum+=ch-'0';
                if (ch=='2')two++;
                if (ch=='3')three++;
            }
            boolean flag=false;
            outer:
            for (int i=0;i<=two;i++){
                for (int j=0;j<=three;j++){
                    int s = sum + i*2 + j*6;
                    if (s%9==0){
                        flag=true;
                        break outer;
                    }
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
