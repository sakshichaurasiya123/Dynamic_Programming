/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		int value=in.nextInt();
		int result=mincoin(arr,n,value);
		System.out.println(result);
	}
	//Using Recursion
	/*
	static int mincoin(int arr[],int n,int val){
	    if(val==0)
	        return 0;
	   int res=Integer.MAX_VALUE;
	   for(int i=0; i<n; i++){
	       int subresult=0;
	       if(arr[i]<=val){
	       subresult=mincoin(arr,n,val-arr[i]);
	       if(subresult!=Integer.MAX_VALUE)
	        res=Math.min(subresult+1,res);
		}
	   }
	   return res;
	}*/
	//Using DP
	static int mincoin(int arr[],int n,int val){
	    int dp[]=new int[val+1];
	    Arrays.fill(dp,Integer.MAX_VALUE);
	    dp[0]=0;
	    for(int i=1; i<=val; i++){
	        for(int j=0; j<n; j++){
	            int subresult=0;
	            if(arr[j]<=i){
	               subresult=dp[i-arr[j]];
	            
	            if(subresult!=Integer.MAX_VALUE)
	                dp[i]=Math.min(subresult+1,dp[i]);
		    }
	        }
	    }
	    return dp[val];
	}
}
