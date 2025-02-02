package StateCode;

public class CashWithdrawalState extends ATMState {

    private final ATM atm;

    public CashWithdrawalState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard(String card) {
        throw new UnsupportedOperationException("Card is already insert!");
    }

    @Override
    public void selectOperation(String transactionType) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void cashWithdrawal(int withdrawalAmount) {
        // bankAccount.withdraw(withdrawalAmount);
    }

    @Override
    public void displayBalance() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void transferMoney(String accountNumber, double transferAmount) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void returnCard() {
        atm.setCurrentState(new IdleState(atm));
    }

    @Override
    public void exit() {
        atm.setCurrentState(new IdleState(atm));
    }
}