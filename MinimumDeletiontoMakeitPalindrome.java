/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		palindromic(s,s.length());
	}
	public static void palindromic(String s,int n){
	    StringBuffer br=new StringBuffer();
	    
	    for(int i=0; i<s.length(); i++)
	        br.append(s.charAt(i));
	        br.reverse();
	   String s1=new String(br);
	    int dp[][]=new int[n+1][n+1];
	    for(int i=0; i<=n; i++)
	        dp[i][0]=0;
	   for(int i=0; i<=n; i++)
	        dp[0][i]=0;
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=n; j++){
	            if(s.charAt(i-1)==s1.charAt(j-1))
	            {
	                dp[i][j]=1+dp[i-1][j-1];
	            }
	            else 
	                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
	        }
	    }
	    System.out.println( s.length()-dp[s.length()][s1.length()]);
	}
}
