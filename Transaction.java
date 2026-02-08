public class Transaction {
    public Customer customer;
    public Product product;

    //Constructor
    public Transaction(Customer c) {
        customer = c; 
        product = new Product(); 
        product.modelName = "Vivo Y11";
        product.price = 3999.00;
    }

    //Identifier
    public String identify() {
        return "I am the Transaction class. I record customer purchases.";
    }

    //Format for printing the transaction report
    public String getReport() {
        return "----- TRANSACTION REPORT -----\n"
               + customer.getDetails() + "\n"
               + product.getDetails();
    }
}