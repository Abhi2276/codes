package codes;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class Emp_Greatest {
	
	public static void main(String[] args)
	{
		List<Emp>list=new ArrayList<>();
		list.add(new Emp(22,"abhi"));
		list.add(new Emp(32,"abc"));
		list.add(new Emp(11,"xyz"));
		
	Emp e=	list.stream().max(Comparator.comparing(Emp::getAge)).get();
	System.out.println(e);
	
	  List<Emp>res=list.stream().filter((n)->n.getName().startsWith("a")).collect(Collectors.toList());
		System.out.println(res);
	}

}
