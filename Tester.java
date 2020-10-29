public class Tester{
  public static void main(String[]args){

// Account
    BankAccount test = new BankAccount(123456789, "password");

// Getters and Setter
    System.out.println(test.getBalance());
    System.out.println(test.getAccountID());
    test.setPassword("newpassword");

    System.out.println(test.toString());

// Deposit tests
    System.out.println(test.deposit(-20));
    System.out.println(test.getBalance());
    System.out.println(test.deposit(97.86));
    System.out.println(test.getBalance());
    System.out.println(test.deposit(2.14));
    System.out.println(test.getBalance());
    System.out.println(test.deposit(-10));
    System.out.println(test.getBalance());
    System.out.println(test.deposit(0));
    System.out.println(test.getBalance());

    System.out.println(test.toString());

// Withdrawal tests
    System.out.println(test.withdraw(-20));
    System.out.println(test.getBalance());
    System.out.println(test.withdraw(49.50));
    System.out.println(test.getBalance());
    System.out.println(test.withdraw(25.50));
    System.out.println(test.getBalance());
    System.out.println(test.withdraw(-10));
    System.out.println(test.getBalance());
    System.out.println(test.withdraw(0));
    System.out.println(test.getBalance());

    System.out.println(test.toString());
    
  }
}
