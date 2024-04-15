package easy_800;

import java.util.Scanner;

public class Doors_and_Keys {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int r=0,g=0,b=0;
            int i;
            for (i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='r')r++;
                else if(ch=='g')g++;
                else if(ch=='b')b++;
                else if(ch=='R'){
                    if(r<1)break;
                    else r--;
                }
                else if(ch=='G') {
                    if (g < 1) break;
                    ;
                    g--;
                }
                else {
                    if(b<1)break;;
                    b--;
                }
            }
            if(i==s.length()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
