package StateCode;

public class ATM {

    private ATMState currenAtmState;
    private String atmCard;

    public ATM() {
        currenAtmState = new IdleState(this);
    }

    public void setCurrentState(ATMState state) {
        this.currenAtmState = state;
    }

    public void setAtmCard(String atmCard) {
        this.atmCard = atmCard;
    }

    public void insertCard(String card) {
        currenAtmState.insertCard(card);
    }

    public void selectOperation(String transactionType) {
        currenAtmState.selectOperation(transactionType);
    }

    public void cashWithdrawal(int withdrawalAmount) {
        currenAtmState.cashWithdrawal(withdrawalAmount);
    }

    public void displayBalance() {
        currenAtmState.displayBalance();
    }

    public void transferMoney(String accountNumber, double transferAmount) {
        currenAtmState.transferMoney(accountNumber, transferAmount);
    }

    public void returnCard() {
        currenAtmState.returnCard();
    }

    public void exit() {
        currenAtmState.exit();
    }
}