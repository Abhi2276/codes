package hashMap;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class ConcHashMapEx {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer,String>map=new ConcurrentHashMap<>();
		map.put(111,"abhi");
		map.put(112, "ram");
		map.put(113, "shyam");
		map.put(114, "baburao");
		
		Iterator it=map.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println(map.get(it.next()));
			map.put(115, "alok");
		}

	}

}
