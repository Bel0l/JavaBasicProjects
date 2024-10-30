public class Product {

    private double productId ;
    private String productName;
    private double productPrice;
    private int stock;

    public Product (double productId, String productName, double productPrice ,int stock
     ){
        this.productId= productId;
        this.productName= productName;
        this.productPrice= productPrice;
        this.stock=stock;

    }

    public double getProductId (){
        return productId;
    }
    public void setProductId (double productId){
        this.productId=productId;
    }
    public String getProductName (){
        return productName;
    }
    public void setProductName (String productName){
        this.productName=productName;
    }
    public double getProductPrice(){
        return productPrice;
    }
    public void setProductPrice(double productPrice){
        this.productPrice=productPrice;
    }

    public void reduceStock( int quantity) {
        if ( quantity <= stock){
            stock -= quantity;
        }
        else {
            System.out.println(" this product is out of stock ");
        }
    }
}
