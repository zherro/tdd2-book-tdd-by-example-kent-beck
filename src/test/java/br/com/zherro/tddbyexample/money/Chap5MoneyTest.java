package br.com.zherro.tddbyexample.money;

import br.com.zherro.tddbyexample.money.chap.DollarChap5;
import org.junit.Assert;
import org.junit.Test;

public class Chap5MoneyTest {

    @Test
    public void testMultiplication() {
        DollarChap5 five= new DollarChap5(5);
        DollarChap5 product= five.times(2);
        Assert.assertEquals(10, product.amount);
        product= five.times(3);
        Assert.assertEquals(15, product.amount);
    }

    @Test
    public void testEquality() {
        Assert.assertTrue(new DollarChap5(5).equals(new DollarChap5(5)));
        Assert.assertFalse(new DollarChap5(5).equals(new DollarChap5(6)));
    }

}
