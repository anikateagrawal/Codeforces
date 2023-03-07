package contests;

import java.util.Scanner;

public class Serval_and_InversionMagic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char a[]=s.toCharArray();
            if(fun(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean fun(char a[]){
        int i=0;
        int j=a.length-1;
        int l=-1;
        while (i<j) {
            if(a[i]==a[j]);
            else {
                if(l==-1){
                    l=i;
                }
                else if(i==l+1){
                    l++;
                }
                else return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
