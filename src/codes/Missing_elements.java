package codes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Missing_elements {
	
	public static void main(String[] args) {
		
		int irr[] = {0};
	int b=0;
		int arr[]= {1,2,3,4,2,3,5,9,2,6,7,8};
		int brr[]= {1,2,3,4,6};
		
	Map<Integer,Integer> map=new HashMap<>();
		
		for (int i = 0; i < arr.length; i++)
	      {
	         if (map.containsKey(arr[i]))
	         {
	           map.put(arr[i], map.get(arr[i]) + 1);
	         }
	         else                                           
	         {
	           map.put(arr[i], 1);
	         }
	     }
		for (int i = 0; i < brr.length; i++)
	      {
	         if (map.containsKey(brr[i]))
	         {
	           map.put(brr[i], map.get(brr[i]) + 1);
	         }                                             
	         else
	         {
	           map.put(brr[i], 1);
	         }
	     }
		
		ArrayList<Integer> xyz=new ArrayList<Integer>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
	     {    
		
	     if(entry.getValue()==1) {
	     	
	   
	    	 xyz.add(entry.getKey());
	    
	     }
		 
	     	}
		
		
	
	        Object[] obj = xyz.toArray();
	    	int z=obj.length-1;
	        for(int j=0;j<obj.length;j++ ) {
	    		if(j<z) {
	    			System.out.print(obj[j]+",");
	    		}
	    		else {
	    			System.out.print(obj[j]);
	    		}
		
	     }

		
	}
}
