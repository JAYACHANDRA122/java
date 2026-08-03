import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t>0)
	    {
	        
	    int n=sc.nextInt();
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	for(int i=0;i<n;i++)
	{
	    int x=sc.nextInt();
	    if(x>max)max=x;
	    if(x<min)min=x;
	}
	System.out.println(max-min);
	t--;
	}
	

	}
}
