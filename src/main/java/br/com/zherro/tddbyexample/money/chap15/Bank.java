package br.com.zherro.tddbyexample.money.chap15;

public class Bank {

    public Money reduce(Expression source, String to) {
        Sum sum= (Sum) source;
        int amount= sum.augend.amount + sum.addend.amount;
        return new Money(amount, to);
    }
}
