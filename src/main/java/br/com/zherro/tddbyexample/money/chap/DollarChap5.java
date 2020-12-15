package br.com.zherro.tddbyexample.money.chap;

public class DollarChap5 {

    public int amount;

    public DollarChap5(int amount){
        this.amount = amount;
    }

    public DollarChap5 times(int multiplier) {
        return new DollarChap5(amount * multiplier);
    }

    public boolean equals(Object object) {
        DollarChap5 dollar= (DollarChap5) object;
        return amount == dollar.amount;
    }
}
