import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
	    Scanner in=new Scanner(System.in);
	    String s1=in.next();
	    String s2=in.next();
	    int m=s1.length();
	    int n=s2.length();
	   int k= minDistance(s1,s2,m,n);
	    System.out.println(k);
	}
	//Using Recursion
	/*static int ed(String s1,String s2,int m ,int n ){
	    if(m==0)
	        return n;
	   if(n==0)
	    return m;
	    if(s1.charAt(m-1)==s2.charAt(n-1) )
	    return ed(s1,s2,m-1,n-1);
	    else
	    return 1+(Math.min(Math.min(ed(s1,s2,m-1,n),ed(s1,s2,m,n-1)),ed(s1,s2,m-1,n-1)));
	    
	}*/
	//Using DP tabular Method
	public static int minDistance(String A, String B,int m,int n) {
      //  int m=A.length();
      //  int n=B.length();
        int dp[][]=new int [m+1][n+1];
        for(int i=0; i<=m; i++)
            dp[i][0]=i;
        for(int i=0; i<=n; i++)
        dp[0][i]=i;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(A.charAt(i-1)==B.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
            }
        }
        return dp[m][n];
	
	}
}
