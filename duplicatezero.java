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
	    array(arr,n);
	}
	public static void array(int arr[],int n){
	    int count=0;
	    for(int i:arr)
	        {
	            if(i==0)
	                count++;
	        }
	        int i=n-1;
	        int j=n+count-1;
	        while(i!=j){
	            insert(arr,i,j--);
	            if(arr[i]==0)
	                insert(arr,i,j--);
	        i--;
	            
	        }
	        System.out.println(Arrays.toString(arr));
	}
	static void insert(int arr[],int i,int j){
	    if(j<arr.length)
	        arr[j]=arr[i];
	}
}
