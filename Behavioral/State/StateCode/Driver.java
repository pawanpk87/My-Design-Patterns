package StateCode;

public class Driver {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.insertCard("atmcard");
        atm.selectOperation("withdraw");
        atm.transferMoney(null, 0);
    }
}