package tests.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entity.Account;
import tests.factory.AccountFactory;

public class AccountTestes {
	@Test
	public void depositShouldIncreaseBalanceWhenPositivAmount() {
		
		double amount  = 200.0;
		double expectedValue = 196.0;
		Account acc = AccountFactory.createEmptyAccount();
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
		
	}
	@Test
	public void epositShouldNotingheWhenNegativeAmount() {
		
		double expectedValue = 100.0;
		Account acc = AccountFactory.createAccount(expectedValue);
		double amount = -200.0;
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	@Test
	public void fullWithdrawShouldClearBalance() {
		
		double initialBalance = 800.0;
		double expectedValue = 0.0;
		Account acc = AccountFactory.createAccount(800.0);
		double result = acc.fullWithDraw();
		
		Assertions.assertTrue(expectedValue == acc.getBalance());
		Assertions.assertTrue(result == initialBalance);
	}
	@Test
	public void withDrawShouldDecreaseBalanceWhenSufficientBalance() {
		Account acc = AccountFactory.createAccount(800.0);
		
		acc.withdraw(500.0);
		
		Assertions.assertEquals(300.0, acc.getBalance());
		
		
	}
	@Test
	public void withDrawShouldThrowExceptionInsufficientBalance() {
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			
			Account acc = AccountFactory.createAccount(800.0);
			acc.withdraw(801.0);
			
		});
		
		
	}

}













