package easy_1100;

import java.util.HashSet;
import java.util.Scanner;

public class Erase_First_or_Second_Letter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            String str=s.next();
            int ans=0;
            HashSet<Character> h=new HashSet<>();
            for(int i=0;i<n;i++) {
                h.add(str.charAt(i));
                ans+=h.size();
            }
            System.out.println(ans);
        }
    }

}
