public class UserTransaction extends Thread {
    private BankAccount account;
    private boolean isDeposit;
    private int amount;

    UserTransaction(BankAccount account, boolean isDeposit, int amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            if (isDeposit) {
                account.Deposit(amount);
            } else {
                account.Withdraw(amount);
            }
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() +
                    " transaction failed: " + e.getMessage());
        }
    }
}
