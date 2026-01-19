public class BankAccount {
    private int balance;

    BankAccount( int balance){
        this.balance = balance;
    }

    public synchronized void Deposit(int amount) throws IllegalAccessException{
        if(amount< 0){
            throw new IllegalAccessException("Not Possible");
        }
        balance += amount;
         System.out.println(Thread.currentThread().getName() +
        " deposited " + amount + " | Balance: " + balance);

    }   
    public synchronized void Withdraw(int amount) throws Exception{
        if(amount <= 0){
            throw new IllegalAccessException("Not Possible");
        }
        if(amount > balance){
            throw new Exception("Not possible");
        }
        balance -= amount;
         System.out.println(Thread.currentThread().getName() +
        " deposited " + amount + " | Balance: " + balance);
    }
}
