package easy_800;

import java.util.Scanner;

public class Hotelier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int a[]=new int[10];
        for (char ch:s.toCharArray()){
            if(ch=='L'){
                for(int i=0;i<10;i++){
                    if(a[i]==0){
                        a[i]=1;
                        break;
                    }
                }
            }
            else if(ch=='R'){
                for (int i=9;i>=0;i--){
                    if(a[i]==0){
                        a[i]=1;
                        break;
                    }
                }
            }
            else{
                a[ch-'0']=0;
            }
        }
        for (int i:a) System.out.print(i);
    }
}
