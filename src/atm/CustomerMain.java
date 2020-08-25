package atm;

public class CustomerMain {
    public static void main(String[] args) {
        Customer peter = new Customer(1,"Peter","1234");
        Customer nancy = new Customer(2,"Nancy","2345");
    //    System.out.println(peter);
    //    System.out.println(nancy);
    //    System.out.println(peter.checkPin("1234"));
        Bank bank = new Bank("My Bank",new DatabaseDataSource());
        bank.addCustomer(peter);
        bank.addCustomer(nancy);
        System.out.println(bank);
        // เรียก find customer
        Customer c1 = bank.findCustomer(1);
        Customer c80 = bank.findCustomer(80);
     //   System.out.println(c1);
     //   System.out.println(c80);

        Atm atm = new Atm(bank);
        atm.validateCustomer(1,"1234");
        atm.deposit(1000);
        System.out.println(peter);

        atm.transfer(2,200);
        System.out.println(peter);
        System.out.println(nancy);


    }
}
