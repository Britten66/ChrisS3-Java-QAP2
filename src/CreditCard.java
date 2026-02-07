public class CreditCard {



    private Person owner;
    private Money balance;

    private Money creditLimit;

    public CreditCard(Person owner, Money creditLimit){
        this.owner = owner;
        //starting with a balance of 0
        this.balance = new Money(0);

        // cred limit
        this.creditLimit = new Money(creditLimit);
    }

    // methods here

    public Money getBalance(){
        return new Money(balance);
    }

    public Money getCreditLimit(){
        return new Money(creditLimit);
    }

    public String getPersonals(){
        return owner.toString();
    }



    public void charge(Money amount){
        Money newBalance = new Money(balance);
        newBalance.add(amount);


        if(newBalance.compareTo(creditLimit) > 0) {
            System.out.println("Err-Credit Limit Reached.");
        }else {
            balance.add(amount);
            System.out.println("Charge: " + amount);
        }

    }

    public void payment(Money amount){
        balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }

}
