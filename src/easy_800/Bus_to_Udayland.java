package easy_800;

import java.util.Scanner;

public class Bus_to_Udayland {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        boolean flag=false;
        for(int i=0;i<n;i++){
            a[i]=sc.next();
            if(a[i].contains("OO"))flag=true;
        }
        if(!flag) System.out.println("NO");
        else {
            System.out.println("YES");
            for(String s:a){
                if(s.contains("OO") && flag){
                    if(s.indexOf("OO")==0){
                        System.out.println("++"+s.substring(2));
                    }
                    else System.out.println(s.substring(0,3)+"++");
                    flag=false;
                }
                else System.out.println(s);
            }
        }

    }
}
