package easy_800;

import java.util.Scanner;

public class Cut_the_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int total=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                total+=a[i];
            }
            int l=-1,r=-1;
            int s1=0;
            outer:
            for (int i=0;i<n-2;i++){
                s1+=a[i];
                int s2=0;
                for (int j=i+1;j<n-1;j++){
                    s2+=a[j];
                    int s3=total-s2-s1;
                    if (s1%3== s2%3 && s1%3==s3%3){
                        l=i;
                        r=j;
                        break outer;
                    }
                    else if (s1%3!=s2%3 && s2%3!=s3%3 && s1%3!=s3%3){
                        l=i;
                        r=j;
                        break outer;
                    }
                }
            }
            l++;r++;
            System.out.println(l+" "+r);
        }
    }
}
