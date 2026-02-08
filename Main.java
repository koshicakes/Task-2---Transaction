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
        Inventory inventory = new Inventory();
        inventory.customer = customer1;
        inventory.productItem = vivo;

        // Single-stream output
        System.out.println(
            iPhone.identify() + "\n" +
            inventory.identify() + "\n" +
            inventory.getReport()
        );
    }
}