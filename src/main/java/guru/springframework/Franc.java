package guru.springframework;

public class Franc extends Money{

    public Franc(int amount, String currency) {
       super(amount, currency);
    }

    public Franc(int amount) {
        super(amount, "CHF");
    }


   

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    protected String currency() {
        return "CHF";
    }

}
