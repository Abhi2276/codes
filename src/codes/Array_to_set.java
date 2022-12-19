package codes;
import java.util.*;
public class Array_to_set {
	public static void main(String[] args)
	{
	String s="aabbcdertgg";
	char arr[]=s.toCharArray();
	Set<Character>value=new HashSet<Character>();
	
	for(int i=0;i<arr.length;i++)
	{
		value.add(arr[i]);
		
	}
	System.out.println(value);
	
	for(Character i:value)
	{
		System.out.print(i);
	}

}
}
