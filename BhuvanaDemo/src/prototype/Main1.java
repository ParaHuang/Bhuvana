package prototype;

//the prototype pattern is a creational design pattern that involves creating new objects
//by copying(clone) the existing object, rather than using constructor methods
public class Main1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Jack",18,"male");
//        Student s2 = new Student("Jack",18,"male");
        Student s2 = (Student) s1.clone();
        s1.setAge(19);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}

class Student implements Cloneable{
    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
