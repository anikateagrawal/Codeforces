package easy_800;

import java.util.Scanner;

public class Mocha_and_Red_and_Blue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char a[]=s.toCharArray();
            char b[]=s.toCharArray();
            char p='R';
            for (int i=0;i<n;i++){
                if(a[i]=='?'){
                    a[i]=p=='R'?'B':'R';
                    p=a[i];
                }
                else p=a[i];
            }
            p='B';
            for (int i=0;i<n;i++){
                if(b[i]=='?'){
                    b[i]=p=='R'?'B':'R';
                    p=b[i];
                }
                else p=b[i];
            }
            if(count(a)<count(b)){
                System.out.println(new String(a));
            }
            else System.out.println(new String(b));
        }
    }
    static int count(char a[]){
        int c=0;
        for (int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                c++;
            }
        }
        return c;
    }
}
