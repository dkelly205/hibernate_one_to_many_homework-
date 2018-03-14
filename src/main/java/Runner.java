import db.DBHelper;
import models.Customer;
import models.Order;

import java.util.List;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Bruce", "Wayne", "Gotham", "0141111111");
        DBHelper.saveOrUpdate(customer1);

        Customer customer2 = new Customer("Clark", "Kent", "Krypton", "01411100000");
        DBHelper.saveOrUpdate(customer2);

        Order order1 = new Order("Wayne101", customer1);
        DBHelper.saveOrUpdate(order1);

        Order order2 = new Order("Kent102", customer2);
        DBHelper.saveOrUpdate(order2);

        Order order3 = new Order("Kent100", customer2);
        DBHelper.saveOrUpdate(order3);

        Customer foundCustomer = DBHelper.findById(customer2.getId(), "Customer");

        List<Order> ordersOfCustomer1 = DBHelper.getOrders(customer1.getId());

        List<Order> ordersOfCustomer2 = DBHelper.getOrders(customer2.getId());

    }
}
