import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		int result=jump(arr,n);
		System.out.println(result);
	}
	//Using Recursion
	/*
	static int jump(int arr[],int n){
	    if(n==1)
	    return 0;
	    int result=Integer.MAX_VALUE;
	    for(int i=0; i<=n-2; i++){
	       
	        if((i+arr[i])>=n-1){
	         int subresult=jump(arr,i+1);
	        if(subresult!=Integer.MAX_VALUE)
	            result=Math.min(result,subresult+1);
	        }
	    }
	    return result;
	    
	}*/
	//Using DP
	static int jump(int arr[],int n){
	    int dp[]=new int[n];
	    Arrays.fill(dp,Integer.MAX_VALUE);
	    dp[0]=0;
	    for(int i=1; i<n; i++){
	        for(int j=0; j<i; j++){
	            if((j+arr[j])>=i){
	                dp[i]=Math.min(dp[i],dp[j]+1);
	            }
	        }
	    }
	    if(dp[n-1]==Integer.MAX_VALUE)
	        return -1;
	   return dp[n-1];
	}
}
