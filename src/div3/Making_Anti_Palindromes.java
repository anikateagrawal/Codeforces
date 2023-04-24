package div3;

import java.util.Scanner;

public class Making_Anti_Palindromes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();String s=sc.next();
            int b[]=new int[26];
            for(int i=0;i<n;i++){
                b[s.charAt(i)-'a']++;
            }
            int a[]=new int[26];
            for(int i=0;i<n/2;i++){
                if(s.charAt(i)==s.charAt(n-i-1)){
                    a[s.charAt(i)-'a']+=1;
                }
            }
            int x=0;
            int mm=0;
            int y=0;
            for(int i:b){
                y=Math.max(y,i);
            }
            for(int i:a){
                x+=i;
                mm=Math.max(mm,i);
            }
            if(y>n/2||(n&1)!=0){
                System.out.println(-1);
            }
            else if(mm>x-mm){
                System.out.println(mm);
            }
            else{
                System.out.println(x/2+(x&1));
            }
        }
    }
}
