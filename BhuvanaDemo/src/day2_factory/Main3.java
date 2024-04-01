package day2_factory;
//abstract factory
//the factory can create many different objects

//design apps:
//UI   +   Operation
//platform:  IOS   Android  WP

//sample:
public class Main3 {
    public static void main(String[] args) {
        //create an android app = androidUI + androidOperation
        SystemFactory factory = new AndroidFactory();

        OperationController androidOperation = factory.createOperationController();
        UIController androidUI = factory.createUIController();
        KeypadController androidKeypad = factory.createKeypadController();
        androidOperation.control();
        androidUI.display();
        androidKeypad.typing();

        System.out.println();


        SystemFactory factory2 = new IOSFactory();

//        OperationController operation = new AndroidOperationController();
//        UIController ui = new IOSUIController();
//        KeypadController keypad = new AndroidKeypadController();
//        operation.control();
//        ui.display();
//        keypad.typing();



    }
}

interface UIController{
    void display();
}

interface OperationController{
    void control();
}

interface KeypadController{
    void typing();
}

class AndroidOperationController implements OperationController{

    @Override
    public void control() {
        System.out.println("Android OperationController System");
    }
}

class AndroidUIController implements UIController{

    @Override
    public void display() {
        System.out.println("Android UIController System");
    }
}

class AndroidKeypadController implements KeypadController{

    @Override
    public void typing() {
        System.out.println("Android KeypadController System");
    }
}

//use a factory to create every control that be needed in android app
interface SystemFactory{
    OperationController createOperationController();//this method will execute a lot of logic code,eventually it will create an OperationController and return it
    UIController createUIController();
    KeypadController createKeypadController();
}

class AndroidFactory implements SystemFactory{

    @Override
    public OperationController createOperationController() {
        //a lot of code here
        return new AndroidOperationController();
    }

    @Override
    public UIController createUIController() {
        return new AndroidUIController();
    }

    @Override
    public KeypadController createKeypadController() {
        return new AndroidKeypadController();
    }
}

class IOSOperationController implements OperationController{
    @Override
    public void control() {
        System.out.println("IOS OperationController .... ");
    }
}

class IOSUIController implements UIController{

    @Override
    public void display() {
        System.out.println("IOS UIController....");
    }
}

class IOSKeypadController implements KeypadController{

    @Override
    public void typing() {
        System.out.println("IOS KeypadController...");
    }
}
class IOSFactory implements SystemFactory{

    @Override
    public OperationController createOperationController() {
        return new IOSOperationController();
    }

    @Override
    public UIController createUIController() {
        return new IOSUIController();
    }

    @Override
    public KeypadController createKeypadController() {
        return new IOSKeypadController();
    }
}











