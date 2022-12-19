package codes;

public class PrimeNo {
	
	public static void main(String[] args)
	{
		int n=11;
		int c=0;
		
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
			else
			{
				continue;
			}
			
		}
		if(c==1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not priem");
		}
		
		
		
	}

}
