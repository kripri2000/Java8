package java8;


class Student1{
	int rollno;
	String name;
	static String college = "fisat";
	Student1(int r,String n){
		this.rollno = r;
		this.name = n;
	}
	public void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}

public class ThisStatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1(12,"Krishnapriya");
		s1.display();
		Student1 s2 = new Student1(28,"Akshay");
		s2.display();

	}

}
