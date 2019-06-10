import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestBankAccount  extends BankAccount {
  
  @Test
  public void testDebitWithSufficientFunds(){
    BankAccount account = new BankAccount(10);
    double amount=account.debit((double)5);
    Assert.assertEquals(5.0,amount);
  }

}
