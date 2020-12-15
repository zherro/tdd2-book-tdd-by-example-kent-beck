package br.com.zherro.tddbyexample.money.chap;

public class DollarChap6 {

    private int amount;

    public DollarChap6(int amount){
        this.amount = amount;
    }

    public DollarChap6 times(int multiplier) {
        return new DollarChap6(amount * multiplier);
    }

    public boolean equals(Object object) {
        DollarChap6 dollar= (DollarChap6) object;
        return amount == dollar.amount;
    }
}
