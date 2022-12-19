package codes;
import java.util.*; 

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int fac=1;
		for(int i=n;i>0;i--)
		{
			fac=fac*i;
		}
		System.out.println(fac);
		

	}

}
