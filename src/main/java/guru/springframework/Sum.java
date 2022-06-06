package guru.springframework;

public class Sum implements Expression {
    Expression augmend;
    Expression addmend;
    public Sum(Expression augmend, Expression addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Expression reduce(Bank bank, String to){
        int amount = augmend.reduce(bank, to).amount + addmend.amount;
        return new Money(amount, to);
    }

    
    
}
