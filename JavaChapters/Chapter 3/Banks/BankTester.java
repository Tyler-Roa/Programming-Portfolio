/*
* This is test code designed to explore explicit and implict parameters
* Designed by me, Tyler
* @author Tyler Roache
* @version 1.0
* @
*/
class BankTester {
  public static void main(String[] args) {
    BankAccount tester = new BankAccount();
    BankAccount tester2 = new BankAccount(50);
    System.out.println(tester2.getBalance());
    System.out.println("Expected: 50");
    
    tester.deposit(60);
    System.out.println(tester.getBalance());
    System.out.println("Expected: 60");
    tester.withdrawl(50);
    System.out.println(tester.getBalance());
    System.out.println("Expected: 10");
    tester.setTransactionFee(10);
    tester.deductMonthlyCharge();
    System.out.println(tester.getBalance());
    System.out.println("Expected: -10"); //because there was 2 transactions, it makes sense that it would deduct 10 * 2
  }
}