package day1;

public class Student {
    private int no;     //instance variable, every object would have it
    private String name;
    private int age;
    public static String teacherName;//owns by Student class

    public Student(int no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public static void haveActivity(){
        System.out.println("let's have activity");
        System.out.println(teacherName+" will attend it");
//        Student s = new Student(3,"Jane",16);
//        System.out.println(s.name+" is having activity");
//        System.out.println(this.name+name+" will attend it");//inside of a static method,at this moment,you don't even have an object,you can't use the field of an object
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", teacherName=" + teacherName+
                '}';
    }
}
