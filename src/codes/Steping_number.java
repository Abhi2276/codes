package codes;
import java.util.*;

public class Steping_number {
	
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();
		int b=kb.nextInt();
		for(int i=a;i<b;i++)
		{
			int n=i;
			int prevDigit = -1;
			while(n>0)
			{
				 int curDigit = n % 10;
				 
				 if (prevDigit != -1)
		            {
		                // Check if absolute difference between
		                // prev digit and current digit is 1
		                if (Math.abs(curDigit-prevDigit)!= 1)
		                    break;
		            }
				 
				 n /= 10;
		            prevDigit = curDigit;
		        }
			System.out.println(i+" ");
		        
		    }
				 
			}
		
		
		
	}


