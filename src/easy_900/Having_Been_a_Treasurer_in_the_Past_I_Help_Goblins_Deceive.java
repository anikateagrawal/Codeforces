package easy_900;

import java.util.Scanner;

public class Having_Been_a_Treasurer_in_the_Past_I_Help_Goblins_Deceive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int h=0,u=0;
            for (char ch:s.toCharArray()){
                if(ch=='-')h++;
                else u++;
            }
            int l=h/2,r=h/2;
            if(h%2==1)r++;
            System.out.println(1L*l*r*u);
        }
    }
}
