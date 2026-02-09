

//QAP2 Java SD 15 Keyin
// by Christopher Britten
// 02/05/2026
//desc: this is a Java program that will define the full address along with postal address

package Problem1;


public class Money {

    private int dollars;
    private int cents;

public Money(int dollars, int cents){
    this.dollars = dollars;
    this.cents = cents;
}

//overloading constructor this takes different parameeters with the same class

    public Money(int dollars){
    //setting cents to 0 so we can take input correct
// I did this wrong and set cents in the parameter (int dollars, int cents) this has been fixed but making a note for reference.

        this.dollars = dollars;
        this.cents = 0;
    }


    //next we need to duplicate so this will use a copy constructor
    // here I have it labeled as source

    public Money(Money source){
    this.dollars = source.dollars;
    this.cents = source.cents;
    }

    //next step we double it with a double constructor
    public Money(double amount){
    this.dollars = (int)amount;
                this.cents = (int) Math.round((amount - dollars) * 100);
    }


    //returning dollars and cents with getters


    public int getDollars(){
    return dollars;
    }

    //returning cents

    public int getCents(){
    return cents;

    }

    // removed setters - using add here
    // all this method does it add to the source
    public void add(Money source) {

        this.dollars += source.dollars;
        this.cents += source.cents;

        // handler here

        if (this.cents >= 100) {
            this.dollars += this.cents / 100;

            // this is = not += had to fix this after the fact

            this.cents = this.cents % 100;

        }
    }
    public void subtract(Money source) {

        this.dollars -= source.dollars;
        this.cents -= source.cents;
        // subtracting here

        if (this.cents < 0) {
            this.dollars -= 1;
            this.cents += 100;
        }
    }

        // comparing constructor

        public int compareTo(Money source){
            if(this.dollars < source.dollars)
                return -1;
            if(this.dollars > source.dollars)
                return 1;

            if(this.cents < source.cents)
                return -1;

            if(this.cents > source.cents)
                return 1;
            return 0;



        }

        //boolean value here

        public boolean equals(Money source){
    return this.dollars == source.dollars && this.cents == source.cents;
        }

        //pushing to string

    public String toString(){
    return "$" + dollars + "." + String.format("%02d",cents);
    }







}
