package codes;

public class Second_max {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int max1=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				max1=arr[i];
			}
		}
		System.out.println(arr[arr.length-2]);//2nd max
		System.out.println(max1);
		
		int max2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=max1)
			{
				if(arr[i]>max2)
				{
					max2=arr[i];
				}
			}
		}
		System.out.println(max2);
		
		
//		int[] a = { 6, 8, 2, 4, 3, 1, 5, 7 };
//        int max = Integer.MIN_VALUE;
//        int second_max = Integer.MIN_VALUE;
//        int temp;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > max) {
//                temp = max;
//                max = a[i];
//                second_max = temp;
//            } else if (a[i] > second_max && a[i] != max) {
//                second_max = a[i];
//            }
//        }
//        if (second_max == Integer.MIN_VALUE) {
//            System.out.println("No Second Highest value");
//        } else {
//            System.out.println(second_max);
//        }

	}

}
