package easy_800;

import java.util.Scanner;

public class Above_the_Clouds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            int [] count=new int[26];
            for(char ch: str.toCharArray()){
                count[ch-'a']++;
            }
            boolean foudmeornot=false;
            for(int i=1;i<n-1;i++){
                if(count[str.charAt(i)-'a']>1){
                    foudmeornot=true;
                    break;
                }
            }
            System.out.println(foudmeornot?"Yes":"No");
        }
    }
}
