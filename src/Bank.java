public interface Bank {
    void deposit();
    void withdraw();
    void loan();
    void account();
}
abstract class Employeer implements Bank{
    @Override
    public void deposit() {
        System.out.println("Deposit Amount:- "+ 1000);
    }
}
abstract class Employee extends Employeer{
    @Override
    public void withdraw() {
        System.out.println("Withdraw Amount:- " + 500);
    }
}
class Labour extends Employee{
    @Override
    public void loan() {

    }

    @Override
    public void account() {

    }
}
class Test3{
    public static void main(String[] args) {
        Labour l = new Labour(); //Employee e = new Labour();, Employeer em = new Labour();,Bank b = new labour();
        l.account();
        l.loan();
        l.deposit();
        l.withdraw();
    }
}