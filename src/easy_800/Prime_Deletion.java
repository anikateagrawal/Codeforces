package easy_800;

import java.util.Scanner;

public class Prime_Deletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int ans=-1;
        while (t-->0){
            String s=sc.next();
            for (int i=0;i<s.length();i++){
                for (int j=i+1;j<s.length();j++){
                    int num=Integer.parseInt(""+s.charAt(i)+s.charAt(j));
                    if(isPrime(num)){
                        ans=num;
                    }
                }
            }
            System.out.println(ans);
        }
    }
    static boolean isPrime(int n){
        for (int i=2;i<n;i++)if(n%i==0)return false;
        return true;
    }
}
