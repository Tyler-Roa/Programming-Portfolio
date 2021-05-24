class BankAccount {
  private double balance;
  private double transactions = 0;
  private double transactionFee;
  private double freeTransactionAmount = 1;

  public BankAccount() {
    balance = 0;

    /*
    * This constructor sets a 0 balance account
    *
    */
  }
  public BankAccount(double deposit) {
    /*
    * This constructor sets an account at the balance you give it
    * @param deposit
    */
    balance = deposit;

    if(this.freeTransactionAmount > 0) {
      this.freeTransactionAmount --;
    } else {
      transactions ++;
    }

  }
  public void deposit(double deposit) {
    /*
    * This method adds to the balance with the deposit. It also adds upon the transaction * counter
    * @param deposit
    */
    this.balance += deposit;

    if(this.freeTransactionAmount > 0) {
      this.freeTransactionAmount --;
    } else {
      transactions ++;
    }
  }
  public double getBalance() {
    /*
    * This method returns the balance
    * @return balance
    */
    return this.balance;
  }
  public void withdrawl(double withdrawl) {
    /*
    * This method will subtract the parameter from the balance
    * @param withdrawl
    */
    balance -= withdrawl;

    if(this.freeTransactionAmount > 0) {
      this.freeTransactionAmount --;
    } else {
      transactions ++;
    }
  }

  public void setTransactionFee (double fee) {
    /*
    * This method will set the fee that will be multiplied by the # of transactions
    * @param fee
    */
    this.transactionFee = fee;
  }
  public void deductMonthlyCharge() {
    /*
    * This method subtracts the monthly charge from the balance
    */
    this.balance = this.balance - (transactions * transactionFee);
    freeTransactionAmount = 1;

  }

}
