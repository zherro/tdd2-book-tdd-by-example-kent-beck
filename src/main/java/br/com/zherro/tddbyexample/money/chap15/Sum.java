package br.com.zherro.tddbyexample.money.chap15;

public class Sum implements Expression {
    Money augend;
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend= augend;
        this.addend= addend;
    }

}
