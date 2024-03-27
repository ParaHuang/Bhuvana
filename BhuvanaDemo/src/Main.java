// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //create an object/instance of Account
        Account account = new Account();// new Xxx() is using the constructor
        account.setOwner("Jack");
        account.setBalance(2000);
        account.setFrameXxx(3.5);

        Account account2 = new Account("Alex",5000,4.5);

    }
}