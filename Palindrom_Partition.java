/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int i=0;
		int j=s.length()-1;
		int res=solve(s,i,j);
		System.out.println(res);
	}
	//Recursive Solution
	/*static int solve(String s,int i,int j){
	    if (i>=j)
	        return 0;
	   if(ispalindrom(s,i,j)==true)
	         return 0;
	  int min=Integer.MAX_VALUE;
	  for(int k=i; k<=j-1; k++){
	      int temp=1+(solve(s,i,k)+solve(s,k+1,j));
	      if(temp<min)
	        min=temp;
	  }
	  return min;
	}*/
	static dp[][]=new int[1001][1001];
	for(int i=0; i<1001; i++){
	    for(int j=0; j<1001; j++)
	        dp[i][j]=-1;
	}
	static int solve(S,int i,int j){
	    if(i>=j)
	        return 0;
	   if(ispalindrom(s,i,j))
	        return 0;
	        if(dp[i][j]!=-1)
	            return dp[i][j];
	   int dp[i][j]=Integer.MAX_VALUE;
	   for(int k=i; k<=j-1; k++){
	       int temp=1+solve(s,i,j)+solve(s,i,j);
	       if(temp<dp[i][j])
	           d[i][j]=temp;
	   }
	   return dp[i][j];
	}
	static boolean ispalindrom(String s,int i,int j){
	        if(i==j)
	         return true;
	       if(i>j)
	        return false;
	       while(i<j){
	           if(s.charAt(i)!=s.charAt(j))
	            return false;
	           i++;
	           j--;
	       }
	       return true;
	}
	
}
