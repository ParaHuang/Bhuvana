
public class Main2 {

	public static void main(String[] args) {
		School school1 = new SinglePersonSchool();
		Director director = new Director(school1);
		director.construct();	//in this method,we would assign same values for the only one student in this school

		Student student1 = school1.getStudent();
		System.out.println(student1);

		School school2 = new SinglePersonSchool();
		Director director2 = new Director(school2);
		director2.construct();

		Student student2 = school2.getStudent();
		System.out.println(student2);

		System.out.println(student1 == student2);



//		Student stu = new Student();
//		stu.setNo(2);
//		stu.setName("Alice");
//		stu.setAge(19);
//		System.out.println(stu);
	}

}

class Student{//->Product
	private int no;
	private String name;
	private int age;
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
}

interface School{//->Builder
	void buildNo(int no);
	void buildName(String name);
	void buildAge(int age);
	Student getStudent();
}

//disadvantage:   each SinglePersonSchool object would only have one student
class SinglePersonSchool implements School{//->Concrete Builder
	private Student stu = new Student();
	@Override
	public void buildNo(int no) {
		stu.setNo(no);
	}

	@Override
	public void buildName(String name) {
		stu.setName(name);
	}

	@Override
	public void buildAge(int age) {
		stu.setAge(age);
	}

	@Override
	public Student getStudent() {
		return stu;
	}//
}

//would make every student have the same values , but they are different objects
class Director{
	private School school;

	public Director(School school) {
		this.school = school;
	}

	public void construct(){
		school.buildNo(1);
		school.buildName("Jack");
		school.buildAge(18);
	}
}














