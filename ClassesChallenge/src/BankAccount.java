public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private long accountPin;

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountPin() {
        return accountPin;
    }
    public void setAccountPin(long accountPin) {
        this.accountPin = accountPin;
    }

    private boolean isPinCorrect(long pin) {
        if (this.accountPin == pin) {
            return true;
        }
        System.out.println("Incorrect PIN. Please try again.");
        return false;
    }

    public void depositFunds(int pin, double depositAmount) {
        if (!isPinCorrect(pin)) {
            return;
        }

        if (depositAmount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        this.balance += depositAmount;
        System.out.println("Deposited " + depositAmount + " into the following account: " + accountNumber);
        System.out.println("New Balance: $" + balance);
        System.out.println("Thank you! Have a nice day! :).");
    }

    public void withdrawFunds(int pin, double withdrawalAmount) {
        if (!isPinCorrect(pin)) {
            return;
        }

        if (withdrawalAmount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds! You have $" + balance + " in your account.");
            return;
        }
        this.balance -= withdrawalAmount;
        System.out.println("Withdrew $" + withdrawalAmount + " from the following account: " + accountNumber);
        System.out.println("New Balance: $" + balance);
        System.out.println("Thank you! Have a nice day! :).");
    }
}
