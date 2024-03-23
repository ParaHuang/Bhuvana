package day1;

public class Main1 {
    public static void main(String[] args) {
        Student.teacherName = "Para";

        Student student1 = new Student(1,"Jack",18);
        Student student2 = new Student(2,"Tom",17);

        System.out.println(student1);
        System.out.println(student2);

        System.out.println();
//        student1.setTeacherName("Alex");
        Student.teacherName = "Alex";
        //student1.teacherName = "Jack";//warming, to tell you it doesn't belong to object

        System.out.println(student1);
        System.out.println(student2);

        Student.haveActivity();
        Student.haveActivity();
        Student.haveActivity();
        Student.haveActivity();
        Student.haveActivity();
        Student.haveActivity();
//        student1.haveActivity();
        Main1 main1 = new Main1();
        main1.fun1();
    }

    public void fun1(){

    }

}
