package static_code;
import java.util.*;

public class Static_variable_sharing_forDiffObject {
	
	public static void main(String[] args)
	{
		Static_variable_sharing_forObject s1=new Static_variable_sharing_forObject(1,"abhi");
		Static_variable_sharing_forObject s2=new Static_variable_sharing_forObject(2,"Pratap");
		s1.display();
		s2.display();
		
		
	}

}
