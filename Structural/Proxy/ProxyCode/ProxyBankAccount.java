public class ProxyBankAccount implements BankAccount {
    private String user;
    private RealBankAccount realBankAccount;

    public ProxyBankAccount(String user, double initialBalance) {
        this.user = user;
        this.realBankAccount = new RealBankAccount(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        realBankAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if ("Account holder".equals(user)) {
            realBankAccount.withdraw(amount);
        } else {
            System.out.println("Access denied: only Account holder can withdraw money.");
        }
    }
}