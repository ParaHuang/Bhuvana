

//singleton pattern,steps:
//1.make constructor private
//2.create a attribute of this class itself,make it static
//3.instantiate it
//4.create an static method:getInstance, to return this instance
public class Calculator {

    private static Calculator cal = new Calculator();//create an object
    public static Calculator getInstance(){
        return cal;//return the same object, because there is only one
    }

    private Calculator(){
        System.out.println("using constructor to create a new Calculator");
    }

    public void add(int a,int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }

    public void minus(int a,int b){
        System.out.println(a+"-"+b+"="+(a-b));
    }

}
