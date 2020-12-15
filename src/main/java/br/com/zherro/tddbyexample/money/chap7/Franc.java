package br.com.zherro.tddbyexample.money.chap7;

public class Franc {

    private int amount;

    public Franc(int amount){
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object) {
        Franc dollar= (Franc) object;
        return amount == dollar.amount;
    }
}
