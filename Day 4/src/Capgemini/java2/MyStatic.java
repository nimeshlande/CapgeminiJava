package capgemini.java2;

class Student {
	
	public String toString() {
		return("Student roll no ="+rollno+", name is "+name+" School name ="+schoolName);
		}
	public Student(int rollno , String name) {
		super();
		this.rollno =rollno;
		this.name = name;
	}
	private int rollno;
	private String name;
	static String schoolName;

}
public class MyStatic{
	public static void main(String[] args) {
		
		Student.schoolName = "ADC";
		
		Student s1 = new Student(1001,"Nimesh");
		Student s2 = new Student(1002,"Onkar");
		Student s3 = new Student(1003,"Luffy");
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	
		
	}
}
