package StateCode;

public abstract class ATMState {

    public abstract void insertCard(String atmCard);

    public abstract void selectOperation(String transactionType);

    public abstract void cashWithdrawal(int withdrawalAmount);

    public abstract void displayBalance();

    public abstract void transferMoney(String accountNumber, double transferAmount);

    public abstract void returnCard();

    public abstract void exit();
}