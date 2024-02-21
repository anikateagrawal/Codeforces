package easy_1100;

import java.util.Scanner;

public class Cinema_Line {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=0;
        boolean f=true;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x==25)a++;
            else if(x==50){
                if(a==0){
                    f=false;
                    break;
                }
                else {
                    a--;b++;
                }
            }
            else{
                if(b>0&&a>0){
                    b--;
                    a--;
                }
                else if(a>2){
                    a-=3;
                }
                else{
                    f=false;
                    break;
                }
            }
        }
        if(f) System.out.println("YES");
        else System.out.println("NO");
    }
}
