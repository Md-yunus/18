import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int sum=0;
	    for(int i=1;i<a;i++)
	    {
	        if(a%i==0)
	        {
	            sum+=i;
	        }
	    }
	    if(sum==a)
	    {
	        System.out.println("It is Perfect Nmber");
	    }
	    else{
	        System.out.println("Sorry ,It is not a Perfect Number");
	    }
	    
		
	}
}

