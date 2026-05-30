package medium_1700;

import java.util.*;
import java.lang.*;

public class Reverse_a_Substring
{
    public static void build(int[] arr,int[] seg,int low,int end,int i,int orr){
        if(low==end){
            seg[i]=arr[low];
            return;
        }
        int mid=(low+end)>>1;
        build(arr,seg,low,mid,2*i+1,1-orr);
        build(arr,seg,mid+1,end,2*i+2,1-orr);
        if(orr==0)seg[i]=(seg[2*i+1]^seg[2*i+2]);
        else seg[i]=(seg[2*i+1]|seg[2*i+2]);
    }
    public static void update(int[] seg,int low,int end,int i,int index,int val,int orr){
        if(low==end){
            seg[i]=val;
            return;
        }
        int mid=(low+end)>>1;
        if(index<=mid)update(seg,low,mid,2*i+1,index,val,1-orr);
        else update(seg,mid+1,end,2*i+2,index,val,1-orr);
        if(orr==0)seg[i]=(seg[2*i+1]^seg[2*i+2]);
        else seg[i]=(seg[2*i+1]|seg[2*i+2]);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int size=(int)Math.pow(2,n);
        int[] arr=new int[size];
        for(int i=0;i<size;i++)arr[i]=sc.nextInt();
        int[] seg=new int[4*size];
        if(n%2==0)build(arr,seg,0,size-1,0,0);//xor
        else build(arr,seg,0,size-1,0,1);//or
        for(int i=0;i<m;i++){
            int idx=sc.nextInt();
            int val=sc.nextInt();
            idx--;
            if(n%2==0)update(seg,0,size-1,0,idx,val,0);
            else update(seg,0,size-1,0,idx,val,1);
            System.out.println(seg[0]);
        }
    }
}
