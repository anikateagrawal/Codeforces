package questions;

import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            if(fun(n,k,s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean fun(int n, int k, String s){
        char arr[]=s.toCharArray();
        for (int i=k;i<n;i++){
            int p=i%k;
            if(arr[i]!=arr[p]){
                if(arr[i]=='?'){
                    arr[i]=arr[p];
                }
                else if(arr[p]=='?'){
                    arr[p]=arr[i];
                }
                else return false;
            }
        }
        int ones=0,zeroes=0;
        for(int i=0;i<k;i++){
            if(arr[i]=='0')zeroes++;
            else if(arr[i]=='1')ones++;
        }
        if(ones>k/2||zeroes>k/2)return false;
        return true;
    }

}
