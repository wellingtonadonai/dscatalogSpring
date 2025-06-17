package tests.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entity.Account;

public class AccountTestes {
	@Test
	public void depositShouldIncreaseBalanceWhenPositivAmount() {
		
		double amount  = 200.0;
		double expectedValue = 196.0;
		Account acc = new Account(1L, 0.0);
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
		
	}

}
