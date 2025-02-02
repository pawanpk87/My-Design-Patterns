package StateCode;

public class HasCardState extends ATMState {
    private final ATM atm;

    public HasCardState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard(String card) {
        throw new UnsupportedOperationException("Card is already insert!");
    }

    @Override
    public void selectOperation(String transactionType) {
        throw new UnsupportedOperationException("Please authenticate pin first!");
    }

    @Override
    public void cashWithdrawal(int withdrawalAmount) {
        throw new UnsupportedOperationException("Please authenticate pin first!");
    }

    @Override
    public void displayBalance() {
        throw new UnsupportedOperationException("Please authenticate pin first!");
    }

    @Override
    public void transferMoney(String accountNumber, double transferAmount) {
        throw new UnsupportedOperationException("Please authenticate pin first!");
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