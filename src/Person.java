

//QAP2 Java SD 15 Keyin
// by Christopher Britten
// 02/05/2026
//desc: this is a Java program that will define the full adress along with postal address



public class Person {

    // instance variables here

    private String firstName;
    private String lastName;

    private Address address;


// constructor here to take parameters fname lname and address sourced from the Address class

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String toString() {
        return firstName + " " + lastName + ", " + address;
    }
}
