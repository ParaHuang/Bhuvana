public class Main3 {
    public static void main(String[] args) {
        Calculator calculator1 =  Calculator.getInstance();  //new Calculator();//calling constructor
        calculator1.add(10,2);
        calculator1.minus(10,2);

        System.out.println("===================");

        Calculator calculator2 = Calculator.getInstance(); //new Calculator();
        calculator2.add(15,8);
        calculator2.minus(15,8);

        System.out.println(calculator1==calculator2);


    }
}
