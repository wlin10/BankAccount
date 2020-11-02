public class BankAccount{

  private double balance;
  private int accountID;
  private String password;


  public String toString() {
    return ("#" + accountID + "\t" + "$" + balance);
  }

  public BankAccount(int accountID, String password) {
    double balance = 0;
    this.accountID = accountID;
    this.password = password;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String newPass) {
    password = newPass;
  }

  private boolean authenticate(String password) {
    return (this.password.equals(password));
  }

  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance += amount;
      return true;
    }
    return false;
  }

  public boolean withdraw(double amount) {
    if (amount > balance || amount < 0) {
      return false;
    } else {
      balance -= amount;
      return true;
    }
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    return (authenticate(password) && withdraw(amount) && other.deposit(amount));
  }

}
