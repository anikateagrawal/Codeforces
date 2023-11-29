package easy_800;

import java.util.Scanner;

public class Where_s_the_Bishop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int r=-1,c=-1;boolean d=false;
            for(int i=0;i<8;i++){
                String s=sc.next();
                int ct=0;
                int ci=-1;
                for(int j=0;j<8;j++){
                    char ch=s.charAt(j);
                    if(ch=='#'){
                        ct++;
                        ci=j+1;
                    }
                }
                if(ct==2)d=true;
                if(d && ct==1 && r==-1){
                    r=i+1;c=ci;
                }
            }
            System.out.println(r+" "+c);
        }
    }
}
