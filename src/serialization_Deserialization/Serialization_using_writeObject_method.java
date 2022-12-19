package serialization_Deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_using_writeObject_method {
	
	public static void main(String[] args)
	{
		
		Address address=new Address(0111,"btm","hsr","bangalore",(long) 560064);
		
		Employee employee=new Employee(112,"abhi",26,"abc@gmail"," Hello123",address);
		
		//serialization
		
		String filename="employeeSerialized.ser";
		try {
			//saving object in file
		FileOutputStream file=new FileOutputStream(filename);
		
		ObjectOutputStream oos=new ObjectOutputStream(file);
		
		oos.writeObject(employee);
		
		oos.close();
		file.close();
		System.out.println("object has been serialized");
		
		}
		catch(Exception ex)
		{
		  System.out.println(" Io exception has been causeed");	
		}
		
		//deserialization  reading object from file
		
		
		
	}

}
