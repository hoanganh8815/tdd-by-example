package guru.springframework;

public interface Expression {
    int amount = 0;

    public Expression reduce(Bank bank, String to);
}
