package codes;
import java.util.*;

public class PrimeNoBtwn_2no {

	public static void main(String[] args) {
		
		
		int a=5;
		int b=11;
		
		
		int c=0;
		for(int i=a;i<=b;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
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
				System.out.println(i);
			}
			else
			{
				c=0;
			}
			
		}
		}

	}


