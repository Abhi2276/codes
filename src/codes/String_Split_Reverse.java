package codes;
import java.util.*;

public class String_Split_Reverse {
	public static void main(String[] args)
	{

	Scanner kb=new Scanner(System.in);
	String s=kb.nextLine();
	String arr[]=s.split(" ");
//	for(int i=0;i<arr.length;i++)
//	{
//	System.out.print(arr[i]+" ");
//	}
//	
//	for(int i=arr.length-1;i>=0;i--)
//	{
//		System.out.print(arr[i]+" ");
//	}
	String s1="";
	for(int i=s.length()-1;i>=0;i--)
	{
		char ch=s.charAt(i);
		s1=s1+ch;
	}
	System.out.println(s1);
	String brr[]=s1.split(" ");
	for(int i=brr.length-1;i>=0;i--)
	{
		System.out.print(brr[i]+" ");
	}
	
	
}
}
