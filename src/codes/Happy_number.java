package codes;
import java.util.*;

public class Happy_number {
	
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		
		HashSet<Integer> set=new HashSet<>();
		while(n!=1)
		{
			int current=n;
			int s=0;
			while(current!=0)
			{
				s+= (current%10)*(current%10);
				current/=10;
			}
			if(set.contains(s))
			{
				System.out.println("not happy");
				System.exit(0);
			}
			set.add(s);
			n=s;
		}
		System.out.println("happy");
	}
	}


