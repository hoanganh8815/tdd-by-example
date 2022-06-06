package guru.springframework;

/**
 * Created by jt on 2018-10-04.
 */
public class Dollar extends Money{
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Dollar(int amount) {
        super(amount, "USD");
    }

 
    

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    protected String currency() {
        return "USD";
    }

    
}
