package br.com.zherro.tddbyexample.money.chap10;

public abstract class Money {

    protected int amount;

    public abstract Money times(int multiplier);

    public boolean equals(Object object) {
        Money money= (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    public static Dollar dollar(int amount){
        return new Dollar(amount);
    }

    public static Franc franc(int amount){
        return new Franc(amount);
    }

}
