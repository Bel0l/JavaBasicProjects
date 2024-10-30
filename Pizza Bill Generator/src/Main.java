public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("test", "111111", "222222");
        customer.printCustomerInfo();

        Product product = new Product(7676,"test2",86,5);
        System.out.println("productId: " + product.getProductId() + "\n" + "Product Name: " + product.getProductName() );
    }
}