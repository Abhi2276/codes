package codes;
import java.awt.RenderingHints.Key;
import java.util.*;

public class First_nonrepeating_char {
	
	public static void main(String[] args)
	{
		//Scanner kb=new Scanner(System.in);
		
		//String s=kb.nextLine();
		String s="anjalisingh";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			Character  ch=s.charAt(i);
			if(map.containsKey(ch)==false)
			{
				map.put(ch, 1);
			}
			else
			{
				int feq=map.get(ch);
				feq++;
				map.put(ch, feq);
			}
			
			
		}
		Character key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
		System.out.println( "maximum occurance of char "+ " "+key);
		
		boolean nonrepeat=false;
		for(int i=0;i<s.length();i++)
		{
			Character ch=s.charAt(i);
			int feq=map.get(ch);
			if(feq==1)
			{
				System.out.println("First non repeating character" +" " +ch);
				nonrepeat=true;
				break;
			}
				
		}
		if(nonrepeat==false)
		{
			System.out.println(" no");
		}
		
		
	}

}
