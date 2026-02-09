
//QAP2 Java SD 15 Keyin
// by Christopher Britten
// 02/05/2026
//desc: this is a Java program that will define the full adress along with postal address


package Problem1;

public class Address {

    //defining my instance variable

    private String street;
    private String city;
    private String state;

    private String zip;


    // parameterized constructor here

    public Address(String street, String city, String state, String zip ){

        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


    public String toString() {
        return street + ", " + city + ", " + state + ", " + zip;

    }
}
