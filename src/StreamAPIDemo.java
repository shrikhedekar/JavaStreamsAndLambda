import java.util.ArrayList;
import java.util.List;

class Products {
    private int id;
    private String productName;
    private Double price;

    public Products(int id, String productName, Double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}

public class StreamAPIDemo {

    public static void main(String [] args) {

        System.out.println("Working with Streams");

        getProducts().stream().filter(p1->p1.getPrice()>=250000.0).forEach(System.out::println);


    }

    private static List<Products> getProducts () {

        List<Products> productList = new ArrayList<Products>();
        productList.add(new Products(1,"HP",250000.0));
        productList.add(new Products(2,"Vitara",150000.0));
        productList.add(new Products(3,"Acese",450000.0));
        productList.add(new Products(4,"Dell",150000.0));
        productList.add(new Products(5,"Lenovo",850000.0));

        return productList;


    }

}
