import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int wt[]=new int[n];
		int val[]=new int[n];
		for(int i=0; i<n; i++)
		    wt[i]=in.nextInt();
		for(int i=0; i<n; i++)
		    val[i]=in.nextInt();
		int w=in.nextInt();
		int result=knapsack(w,wt,val,n);
		System.out.println(result);
	}
	//Using Recursion
	/*
	static int knapsack(int w,int wt[],int val[],int n){
	    if(n==0|| w==0) 
	        return 0;
	   if(wt[n-1]>w)
	        return knapsack(w,wt,val,n-1);
	   else {
	       return Math.max(knapsack(w,wt,val,n-1),val[n-1]+knapsack(w-wt[n-1],wt,val,n-1));
	        
	   }*/
	   
	   //Using DP
        static int knapsack(int w,int wt[],int val[],int n){
            int dp[][]=new int[n+1][w+1];
            for(int i=0; i<=w; i++)
                dp[0][i]=0;
            for(int i=0; i<=n; i++)
                dp[i][0]=0;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=w; j++){
                    if(wt[i-1]>j)
                        dp[i][j]=dp[i-1][j];
                    else{
                        dp[i][j]=Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]);
                    }
                }
            }
                return dp[n][w];
              
	}
}
