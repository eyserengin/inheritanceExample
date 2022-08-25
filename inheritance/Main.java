package inheritance;


public class Main {
    public static void main(String[] args) {


        CustomerManager customerManager = new CustomerManager();

        IndividualCustomer individualCustomer = new IndividualCustomer();

        individualCustomer.customerNumber = "12345";

        CorporateCustomer corporateCustomer = new CorporateCustomer();

        corporateCustomer.customerNumber = "7890";

        Customer[] customers = {individualCustomer, corporateCustomer};


        customerManager.addMultiple(customers);


    }
}
