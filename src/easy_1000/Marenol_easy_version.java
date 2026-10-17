package easy_1000;

import java.util.Scanner;

public class Marenol_easy_version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            int ea=0,eb=0;
            int oa=0,ob=0;
            for(int i=0;i<n;i++){
                if(a.charAt(i)=='1'){
                    if(i%2==0) ea++;
                    else oa++;
                }
                if(b.charAt(i)=='1'){
                    if(i%2==0) eb++;
                    else ob++;
                }
            }
            if(ea==eb && oa==ob) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
