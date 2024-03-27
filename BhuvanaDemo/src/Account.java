public class Account {
    private String owner;
    private int balance;
    private double frameXxx;

    //empty constructor
    public Account(){
        System.out.println("using the constructor of Account");
    }

    //the use of constructor: initialize all the attributes
    public Account(String owner, int balance, double frameXxx) {
        this.owner = owner;
        this.balance = balance;
        this.frameXxx = frameXxx;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setFrameXxx(double frameXxx) {
        this.frameXxx = frameXxx;
    }
}
