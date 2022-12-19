package codes;

public class Farthest_Elements {

	public static void main(String[] args) {
		
		int arr[]= {3, 1, 5, 2, 4}; //output-2,-1,4,-1,-1 an index-3 -1 4 -1 -1
		
		for(int i=0;i<arr.length;i++)
		{
			int ans=-1;
			for(int j=arr.length-1;j>i;j--)
			{
				if(arr[j]<arr[i])
				{
					ans=j;
					break;
				}
//				else
//				{
//					ans=-1;
//				}
				
				
			}
			System.out.print(ans+" ");
			
		
			
		}

	}

}
