package br.com.zherro.tddbyexample.money.chap10;

public class Franc extends Money {

    public Franc(int amount){
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
