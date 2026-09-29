package easy_900;

import java.util.Scanner;

public class Impost_or_Sus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char a[]=s.toCharArray();
            int c=0;
            if (a[0]=='u'){
                c++;
                a[0]='s';
            }
            if (a[a.length-1]=='u'){
                c++;
                a[a.length-1]='s';
            }
            for (int i=1;i<a.length-1;i++){
                if (a[i]=='u'){
                    if (a[i+1]=='u'){
                        c++;
                        a[i+1]='s';
                    }
                }
            }
            System.out.println(c);
        }
    }
}
