package codes;

import java.util.TreeSet;

public class CharOfName_inAlphabetical {

	public static void main(String[] args) {
		String s="Abhishek";
		char arr[]=s.toCharArray();
		TreeSet<Character>set=new TreeSet<>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		System.out.println(set);
		for(Character c:set)
		{
			System.out.println(c);
		}

	}

}
