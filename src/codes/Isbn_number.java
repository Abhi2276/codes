package codes;
import java.util.*;

public class Isbn_number {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		//int n=kb.nextInt();
	String s=kb.nextLine();
		int d13=0;
	
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			 d13=(arr[0]+3*arr[1] +arr[2]+3*arr[3]+arr[4]+3*arr[5]+arr[6]+3*arr[7]+arr[8]+3*arr[9]+arr[10]+3*arr[11])%10;
		    
		}
		List list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		list.add(d13);
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i));
		}
	}

}



