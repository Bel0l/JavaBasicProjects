public class Customer {
    private String customerId;
    private String customerName;
    private String contact;

    public Customer(String customerName, String contact, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.contact = contact;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getCustomerId() {
        return customerId;
    }


    public void printCustomerInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + customerName);
        System.out.println("Contact: " + contact);
    }
}
