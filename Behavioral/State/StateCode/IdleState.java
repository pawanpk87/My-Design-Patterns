package StateCode;

public class IdleState extends ATMState {
    private ATM atm;

    public IdleState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard(String atmCard) {
        System.out.println("Inserting atm card...");
        atm.setAtmCard(atmCard);
        atm.setCurrentState(new HasCardState(atm));
    }

    @Override
    public void selectOperation(String transactionType) {
        throw new UnsupportedOperationException("Please insert card first!");
    }

    @Override
    public void cashWithdrawal(int withdrawalAmount) {
        throw new UnsupportedOperationException("Please insert card first!");
    }

    @Override
    public void displayBalance() {
        throw new UnsupportedOperationException("Please insert card first!");
    }

    @Override
    public void transferMoney(String accountNumber, double transferAmount) {
        throw new UnsupportedOperationException("Please insert card first!");
    }

    @Override
    public void returnCard() {
        throw new UnsupportedOperationException("No card to return!");
    }

    @Override
    public void exit() {
        atm.setCurrentState(new IdleState(atm));
    }

    public ATM getAtm() {
        return atm;
    }
}