public class Main {
    public static void main(String[] args) {
        BankAccount tjsBank = new BankAccount();
        tjsBank.setAccountNumber(1234);
        tjsBank.setBalance(500);
        tjsBank.setEmail("tjs@gmail.com");
        tjsBank.setCustomerName("TeeJay");
        tjsBank.setPhoneNumber("256123123");
        tjsBank.setAccountPin(19933333);

        // Correct PIN usage
        tjsBank.depositFunds(19933333, 2000); // Should work
        tjsBank.withdrawFunds(19933333, 700); // Should work

        // Incorrect PIN usage
        tjsBank.depositFunds(198, 500);  // Should fail
        tjsBank.withdrawFunds(198, 300); // Should fail

        // Incorrect Withdrawal
        tjsBank.withdrawFunds(19933333, 1000000);
    }
}
