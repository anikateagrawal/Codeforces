package easy_800;

import java.util.Scanner;

public class MIN_MEX_Cut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int p=-1;
            int c=0;
            for (char ch:s.toCharArray()){
                if(ch==p){
                    continue;
                }
                else {
                    if (ch=='0')c++;
                    p=ch;
                }
            }
            if (c>2)c=2;
            System.out.println(c);
        }
    }
}
