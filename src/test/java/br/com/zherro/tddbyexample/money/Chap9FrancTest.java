package br.com.zherro.tddbyexample.money;

import br.com.zherro.tddbyexample.money.chap9.Franc;
import br.com.zherro.tddbyexample.money.chap9.Dollar;
import org.junit.Assert;
import org.junit.Test;

public class Chap9FrancTest {

    @Test
    public void testMultiplication() {

        Franc five= new Franc(5);
        Assert.assertEquals(new Franc(10), five.times(2));
        Assert.assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
        Assert.assertTrue(new Franc(5).equals(new Franc(5)));
        Assert.assertFalse(new Franc(5).equals(new Franc(6)));
        Assert.assertFalse(new Franc(5).equals(new Dollar(5)));
    }

}
