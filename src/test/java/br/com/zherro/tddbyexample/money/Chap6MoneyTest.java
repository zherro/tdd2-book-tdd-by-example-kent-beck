package br.com.zherro.tddbyexample.money;

import br.com.zherro.tddbyexample.money.chap.DollarChap6;
import org.junit.Assert;
import org.junit.Test;

public class Chap6MoneyTest {

    /**
     *  1 - temos um construtor que criar o objeto Dollar e nosso metodo times retorna um novo
     *  objeto. Isso nos permite comparar objeos, e ao invés de uma seria de operações teremos
     *  apenas uma asserção verdadeira.
     *  Com isso podemos tornar o atributo ammount privado sem quebrar nossos testes.
     */
    @Test
    public void testMultiplication() {

        DollarChap6 five= new DollarChap6(5);
        Assert.assertEquals(new DollarChap6(10), five.times(2));
        Assert.assertEquals(new DollarChap6(15), five.times(3));
    }

    @Test
    public void testEquality() {
        Assert.assertTrue(new DollarChap6(5).equals(new DollarChap6(5)));
        Assert.assertFalse(new DollarChap6(5).equals(new DollarChap6(6)));
    }

}
