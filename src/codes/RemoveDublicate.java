package codes;
import java.util.*;
public class RemoveDublicate {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		char arr[]=s.toCharArray();
//		List<Character>list=new ArrayList<>();
//		for(int i=0;i<arr.length;i++)
//		{
//			list.add(arr[i]);
//		}
		
		
		
		
		
//		Set<Character> res=new TreeSet<>();
//		for(int i=0;i<arr.length;i++)
//		{
//			res.add(arr[i]);
//		}
//		System.out.println(res);
		
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
				
			}
			else 
			{
				map.put(arr[i], 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet())
	     {    if(entry.getValue()!=1)
	          System.out.println(entry.getKey()+" ");
	     }
		
     // List<Character> out=list.stream().filter(e->e.equals!(list))
	}

}
