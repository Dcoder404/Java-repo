import java.util.*;

class Student	{
	int rollno, age;
	String name;
	
	Student(int rollno, String name, int age)	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}









public class UserDefinedObjects {

	public static void main(String[] args) {
		
		// creating user defined class objects
		
		Student s1 = new Student(101, "Sonu", 23);
		Student s2 = new Student(111, "Sonvi", 21);
		Student s3 = new Student(102, "Rajat", 22);

		ArrayList<Student> al = new ArrayList<Student> (); //creating arraylist
		
		// adding student class object
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr = al.iterator();
		
		//traversing elements of ArrayList object
		
	while(itr.hasNext())	{
		Student st = (Student)itr.next();
		System.out.println(st.rollno + " " +st.name + " " +st.age);
	}
	}

}
