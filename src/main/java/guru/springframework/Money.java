package guru.springframework;

public class Money implements Expression {

    protected int amount;

    protected String currency;

    protected String currency(){
        return this.currency;
    }

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Expression times(int multiplier){
        return new Money(amount * multiplier, currency);
    }

    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public boolean equals(Object object){

        Money dollar = (Money) object;

        return amount == dollar.amount && this.currency() == dollar.currency();
    
    }

    public Expression plus(Money added){
        return new Sum(this, added);
    }

    public Expression reduce(Bank bank, String to){
        int rate = currency.equals("CHF") && to.equals("USD") ? 2: 1;

        return new Money(amount / bank.rate(this.currency, to), to);
    }
}
