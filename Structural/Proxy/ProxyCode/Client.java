public class Client {
    public static void main(String[] args) {
        System.out.println("-------------------- Account holder -------------------");
        BankAccount accountHolder = new ProxyBankAccount("Account holder", 1200.0);
        accountHolder.deposit(200);
        accountHolder.withdraw(100);

        System.out.println("-------------------- Not Account holder -------------------");
        BankAccount bankAccount = new ProxyBankAccount("Not Account holder", 1200.0);
        bankAccount.deposit(200);
        bankAccount.withdraw(100);
    }
}
