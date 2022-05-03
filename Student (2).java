package SerializableExample;
import java.io.*;

public class Student implements Serializable {

	String sname;
	int rollno;
	Student(String a,int b)
	{
		sname=a;
		rollno=b;
		
	}void display()
	
	{
		System.out.println(sname + " " + rollno);
	}
	
}
