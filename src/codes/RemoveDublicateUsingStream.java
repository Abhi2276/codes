package codes;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDublicateUsingStream {
	public static void main(String[] args)
	{
		
		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(2);
		HashSet<Integer>set=new HashSet<>();
List<Integer>res=list.stream().filter((e)->!set.add(e)).collect(Collectors.toList());
System.out.println(res);
	}

}
