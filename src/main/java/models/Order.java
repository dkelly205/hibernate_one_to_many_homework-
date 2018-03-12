package models;

public class Order {

    private int id;
    private String order_number;
    private Customer customer;

    public Order(){}

    public Order(String order_number, Customer customer) {
        this.order_number = order_number;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}


