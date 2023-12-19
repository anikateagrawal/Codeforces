package easy_800;

import java.util.Scanner;

public class Target_Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int s=0;
            for(int i=0;i<10;i++){
                String ss=sc.next();
                for(int j=0;j<10;j++){
                    char ch=ss.charAt(j);
                    if(ch=='X'){
                        int ir=9-i,jr=9-j;
                        int m=Math.min(ir,jr);
                        int mm= Math.min(i,j);
                        s+=Math.min(m,mm)+1;
                    }
                }
            }
            System.out.println(s);
        }
    }
}
