package easy_1000;

import java.util.Scanner;

public class Bear_and_Finding_Criminals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int a=sc.nextInt()-1;
        int c[]=new int[n];
        for (int i=0;i<n;i++)c[i]=sc.nextInt();
        int ans=0;
        int i=a,j=a;
        while (i>=0&&j<n){
            int left=c[i];
            int right=c[j];
            if(left==1 && right ==1){
                if(i==j)ans+=1;
                else ans+=2;
            }
            i--;
            j++;
        }
        while (i>=0){
            ans+=c[i--];
        }
        while (j<n){
            ans+=c[j++];
        }
        System.out.println(ans);

    }
}
