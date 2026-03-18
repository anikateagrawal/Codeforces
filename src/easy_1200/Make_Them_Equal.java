package easy_1200;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Make_Them_Equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            char ch=sc.next().charAt(0);
            String s=sc.next();
            List<Integer> l=new ArrayList<>();
            int in=-1;
            for (int i=0;i<n;i++){
                if(s.charAt(i)!=ch){
                    l.add(i+1);
                }
                if(i>=n/2 && s.charAt(i)==ch)in=i+1;
            }
            if (l.size()==0) System.out.println(0);
            else {
                if(in==-1){
                    System.out.println(2);
                    System.out.println(n-1+" "+n);
                }
                else {
                    System.out.println(1);
                    System.out.println(in);
                }
            }
        }
    }
}
