package codes;
import java.util.*;
public class Max_OccuranceOfChar {

	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String s=kb.next();
		char[] arr=s.toCharArray();
		
		Map<Character, Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
			
		}
		
		Character key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
		System.out.println( "maximum occurance of char "+ " "+key);
		
	}
}
