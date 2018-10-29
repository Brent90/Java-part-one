
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        int addedEuros = this.euros + added.euros;
        int addedCents = this.cents + added.cents;
        Money money = new Money(addedEuros, addedCents);
        return money;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros <= compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decremented) {
        int minusEuros = this.euros - decremented.euros;
        int minusCents = this.cents - decremented.cents;

        if (minusEuros < 0) {
            Money money = new Money(0, 0);
            return money;
        } 
        
        if(minusCents < 0) {
            int adjustedCents = 100 + minusCents;
            Money money = new Money(minusEuros - 1, adjustedCents);
            return money;
        }
        
        
        Money money = new Money(minusEuros, minusCents);

        return money;

    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
