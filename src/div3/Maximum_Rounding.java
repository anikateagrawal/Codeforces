package div3;

import java.util.Scanner;

public class Maximum_Rounding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char a[]=s.toCharArray();
            char n[]=new char[a.length+1];
            for(int i=0;i<a.length;i++)n[i+1]=a[i];
            n[0]='0';
            int l=-1;
            for (int i = 1; i <=a.length ; i++) {
                if(n[i]>=5+'0'){
                    l=i;
                    int c=1;
                    for (int j = i-1; j >=0 ; j--) {
                        int d=n[j]+c-'0';
                        if(d>=5){
                            l=j;
                            c=1;
                        }
                        else c=0;
                        n[j]=(char) (d%10+'0');
                    } break;
                }
            }
            if(l!=-1){
                for (int i = l; i <=a.length ; i++) {
                    n[i]='0';
                }
            }
            String ns=new String(n);
            if(ns.charAt(0)!='0') System.out.println(ns);
            else System.out.println(ns.substring(1));
        }
    }
}
