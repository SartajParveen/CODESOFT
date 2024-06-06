public class User{
    private String UserName;
    private int pin;
    private String accountNumber;
    private int cvv;
    private double balance;
    private int monthofExpiry;
    private int yearofExpiry;
  

    public User(String userName, int pin, String accountNumber, int cvv, double balance, int monthofExpiry,
            int yearofExpiry) {
        UserName = userName;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.cvv = cvv;
        this.balance = balance;
        this.monthofExpiry = monthofExpiry;
        this.yearofExpiry = yearofExpiry;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getMonthofExpiry() {
        return monthofExpiry;
    }
    public void setMonthofExpiry(int monthofExpiry) {
        this.monthofExpiry = monthofExpiry;
    }
    public int getYearofExpiry() {
        return yearofExpiry;
    }
    public void setYearofExpiry(int yearofExpiry) {
        this.yearofExpiry = yearofExpiry;
    }
   
}
