package atm;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    private DatabaseDataSource dataSource;

public Bank(String name){
    this.name = name;
   // this.customers = new ArrayList<>();
    this.dataSource = new DatabaseDataSource();
    this.customers = dataSource.getCustomerData();
}
public void addCustomer(Customer c){
    customers.add(c);
}
// method search id of customer
public Customer findCustomer(int id){
   // Customer result = null;
   // looping
    for(Customer element: customers){
        if(element.getId() == id)
           return element;
    }
    return null;
}

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
