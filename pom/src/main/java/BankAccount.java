import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;




public class BankAccount {

  public double balance;

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public double debit(double amount) {
    if (balance < amount) {
      amount = balance;
    }

    balance -= amount;
    return amount;
  }

}

private class TestBankAccount{
  
  @Test
  public void testDebitWithSufficientFunds(){
    BankAccount account = new BankAccount(10);
    double amount=account.debit((double)5);
    Assert.assertEquals(5.0,amount);
  }

}
