package com.duelist.study;

public abstract class Money {

    protected int amount;
    protected String currency;

    abstract Money times(int multiplier);

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && this.getClass() == obj.getClass();
    }
}
