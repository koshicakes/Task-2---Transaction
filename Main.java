public class Main {
    public static void main(String[] args) {
        // Create objects
        Customer customer1 = new Customer();
        Product vivo = new Product();

        // Assign values
        customer1.fullName = "Richard Valentos";
        vivo.modelName = "Vivo Y11";
        vivo.price = 2500;

        // Create inventory and assign objects
        Transaction transaction = new Transaction();
        transaction.customer = customer1;
        transaction.productItem = vivo;

        // Single-stream output
        System.out.println(
            vivo.identify() + "\n" +
            transaction.identify() + "\n" +
            transactions.getReport()
        );
    }
}