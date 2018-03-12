package models;

import java.util.Set;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private Set<Order> orders;

    public Customer(){}

    public Customer(String firstName, String lastName, String address, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public void setphoneNumber(String telephoneNumber) {
        this.phoneNumber = telephoneNumber;
    }


}
