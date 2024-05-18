package easy_1000;

import java.util.Scanner;

public class Present_from_Lena {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<=n;i++){
            int sp=n-i;
            String s="";
            for (int j=0;j<sp;j++) s+="  ";
            for (int j=0;j<=i;j++) s+=j+" ";
            for (int j=i-1;j>=0;j--) s+=j+" ";
            System.out.println(s.substring(0,s.length()-1));
        }
        for (int i=n-1;i>=0;i--){
            int sp=n-i;
            String s="";
            for (int j=0;j<sp;j++) s+="  ";
            for (int j=0;j<=i;j++) s+=j+" ";
            for (int j=i-1;j>=0;j--) s+=j+" ";
            System.out.println(s.substring(0,s.length()-1));
        }
    }
}
