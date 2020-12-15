package br.com.zherro.tddbyexample.money;

import br.com.zherro.tddbyexample.money.chap15.Money;
import br.com.zherro.tddbyexample.money.chap15.Bank;
import br.com.zherro.tddbyexample.money.chap15.Expression;
import br.com.zherro.tddbyexample.money.chap15.Sum;
import org.junit.Assert;
import org.junit.Test;

public class Chap15MoneyTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        Assert.assertEquals(Money.dollar(10), five.times(2));
        Assert.assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        Assert.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        Assert.assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testCurrency() {
        Assert.assertEquals("USD", Money.dollar(1).currency());
        Assert.assertEquals("CHF", Money.franc(1).currency());
    }


    @Test
    public void testSimpleAddition() {
        Money five= Money.dollar(5);
        Expression sum= five.plus(five);
        Bank bank= new Bank();
        Money reduced= bank.reduce(sum, "USD");
        Assert.assertEquals(Money.dollar(10), reduced);
    }

    @Test
    public void testReduceSum() {
        Expression sum= new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank= new Bank();
        Money result= bank.reduce(sum, "USD");
        Assert.assertEquals(Money.dollar(7), result);
    }


}
