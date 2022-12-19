package hashMap;
import java.util.*;

public class HashMap_product_forEach_method {

	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter no product to add");
		int n=kb.nextInt();
		
		Map<String,Integer> map=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter product");
			String s=kb.next();
			System.out.println("Enter price");
			int p=kb.nextInt();
			map.put(s, p);
			//map.putAll((Map<? extends String, ? extends Integer>) new HashMap_product(s,p));
		}
		
		System.out.println("normal price"+map);
		
		System.out.println("Discounted price");
		
		map.forEach((s,p)->{p=p-p* 10/100;System.out.println(s +" ="+ p+" ");});
		
		//prices.forEach((key, value) -> {

	      // decrease value by 10%
	     // value = value - value * 10/100;
	     // System.out.print(key + "=" + value + " ");
		
	}
}
