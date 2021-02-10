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
        int sum=in.nextInt();
        subset(arr,n,sum);
	}
	static void subset(int arr[],int n, int sum){
	    int dp[][]=new int[n+1][sum+1];
	    for(int i=0; i<=n; i++)
	        dp[i][0]=1;
	   for(int i=1; i<=sum; i++)
	    dp[0][i]=0;
	   for(int i=1; i<=n; i++){
	       for(int j=1; j<=sum; j++){
	           if(arr[i-1]<=j)
	                dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
	           else
	                dp[i][j]=dp[i-1][j];
	       }
	   }
	   for(int i=0; i<=n; i++){
	       for(int j=0; j<=sum; j++)
	            System.out.print(dp[i][j]+" ");
	       System.out.println();
	   }
	}
	
}
