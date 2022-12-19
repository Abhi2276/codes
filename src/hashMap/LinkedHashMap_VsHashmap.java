package hashMap;
import java.util.*;

public class LinkedHashMap_VsHashmap {
	public static void main(String[] args)
	{
	
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(2, "abhi");
	map.put(4,"shek");
	map.put(1, "ajay");
	
	System.out.println(map);
	
	
	LinkedHashMap<Integer,String> lmap=new LinkedHashMap<Integer,String>();
	lmap.put(2, "abhi");
	lmap.put(4,"shek");
	lmap.put(1, "ajay");
	
	System.out.println(lmap);
	
	TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
	tmap.put(2, "abhi");
	tmap.put(4,"shek");
	tmap.put(1, "ajay");
	
	System.out.println(tmap);
	
	
	
	}
}
