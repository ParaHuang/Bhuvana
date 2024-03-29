package day2_factory;

//create
//1.singleton
//2.factory
//3.builder
//4.prototype


//1.simple factory(model/programming habit)
//on the client , you don't need care how those object get created
public class Main1 {
    public Shape s2;    //instance variable
    public static void main(String[] args) {
//        Shape s1 = new Rectangle();//Polymorphism
//        s1.draw();
        //local variable

//        System.out.println(ShapeType.RECTANGLE.name());

        Shape s1 = ShapeFactory.getShape(ShapeType.RECTANGLE);
        Shape s2 = ShapeFactory.getShape(ShapeType.TRIANGLE);
        Shape s3 = ShapeFactory.getShape(ShapeType.ROUND);
////        s1.draw();
//
        Teacher teacher = new Teacher();
        teacher.teaching(s1);
        teacher.teaching(s2);
        teacher.teaching(s3);


//        Rectangle r = new Rectangle();
//        teacher.teaching(r);
//        teacher.teaching(new Triangle());
//        teacher.teaching(new Round());
    }
}

enum ShapeType{
    RECTANGLE,TRIANGLE,ROUND
}

//crate a factory class, to produce all kinds of Shape object
class ShapeFactory{
    public static Shape getShape(ShapeType type){
        Shape s = null;
        if("Rectangle".equalsIgnoreCase(type.name())){
            s = new Rectangle();
        }else if("Triangle".equalsIgnoreCase(type.name())){
            s = new Triangle();
        }else {
            s = new Round();
        }
        return s;
    }
}

class Teacher{
    //use a kind of a shape to draw

    public void teaching(Shape s){
        System.out.println("start to teaching");
        s.draw();
    }
    /*
    public void teaching(Rectangle r){
        System.out.println("start to teaching");
        r.draw();
    }
    public void teaching(Triangle t){
        System.out.println("start to teaching");
        t.draw();
    }
    public void teaching(Round r){
        System.out.println("start to teaching");
        r.draw();
    }

     */
}

interface Shape{
    void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("drawing a Rectangle");
    }
}

class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("drawing a Triangle");
    }
}

class Round implements Shape{
    @Override
    public void draw() {
        System.out.println("drawing a Round");
    }
}



