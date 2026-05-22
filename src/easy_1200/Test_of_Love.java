package easy_1200;

import java.util.Scanner;

public class Test_of_Love {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int w=0,p=-1;
            boolean fl=true;
            for (int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if (ch=='L'){
                    p=i;
                }
                else if (i<p+m)continue;
                else if (ch=='W'){
                    w++;
                    if (w>k){
                        fl=false;
                        break;
                    }
                }
                else {
                    fl=false;
                    break;
                }
            }
            if (fl) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
