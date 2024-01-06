package easy_800;

import java.util.Scanner;

public class Not_Quite_Latin_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int r[]=new int[3];
            for(int i=0;i<3;i++){
                String s=sc.next();
                for(int j=0;j<3;j++){
                    char c=s.charAt(j);
                    if(c=='?')continue;
                    r[i]+=c;
                }
            }
            int tt='A'+'B'+'C';
            for(int i:r){
                if(i!=tt){
                    System.out.println((char)(tt-i));
                    break;
                }
            }
        }
    }
}
