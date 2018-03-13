import db.DBHelper;
import models.Customer;
import org.hibernate.criterion.Order;

public class Runner {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Bruce", "Wayne", "101 Gotham Drive", "0141111111");
        DBHelper.saveOrUpdate(customer1);

        Customer customer2 = new Customer("Clark", "Kent", "Krypton", "01411100000");
        DBHelper.saveOrUpdate(customer2);

        Order order1 = new Order("Wayne101", customer1);
        DBHelper.saveOrUpdate(order1);

        Order order2 = new Order("Kent102", customer2);
        DBHelper.saveOrUpdate(order2);
    }
}
