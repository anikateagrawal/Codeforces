package easy_800;

import java.util.Scanner;

public class Yet_Another_String_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char a[]=s.toCharArray();
            for (int i=0;i<a.length;i++){
                if(i%2==0){
                    if(a[i]=='a')a[i]='b';
                    else a[i]='a';
                }
                else{
                    if(a[i]=='z')a[i]='y';
                    else a[i]='z';
                }
            }
            System.out.println(new String(a));
        }
    }
}
