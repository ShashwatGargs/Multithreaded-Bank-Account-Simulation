public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount( 1000);

        UserTransaction t1 = new UserTransaction(account, true, 500);
        UserTransaction t2 = new UserTransaction(account, false, 300);
        UserTransaction t3 = new UserTransaction(account, false, 1500);

        t1.setName("User-1");
        t2.setName("User-2");
        t3.setName("User-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
