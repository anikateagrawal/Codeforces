package easy_1000;

import java.util.Scanner;
import java.util.Stack;

public class YetnotherrokenKeoard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            StringBuilder ns=new StringBuilder();
            Stack<Integer> sl=new Stack<>();
            Stack<Integer> su=new Stack<>();
            for (int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='b'){
                    if(!sl.empty()){
                        int in=sl.pop();
                        ns.setCharAt(in,' ');
                    }
                    ns.append(" ");
                }
                else if(ch=='B'){
                    if(!su.empty()){
                        int in=su.pop();
                        ns.setCharAt(in,' ');
                    }
                    ns.append(" ");
                }
                else if(ch>='A'&&ch<='Z'){
                    ns.append(ch);
                    su.add(i);
                }
                else{
                    ns.append(ch);
                    sl.add(i);
                }
            }
            String ans=ns.toString().replace(" ","");
            System.out.println(ans);
        }
    }
}
