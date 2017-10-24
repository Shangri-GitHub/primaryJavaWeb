package controller.domain;

public class Product {
    private String pname;
    private String price;

    public Product(String pname, String price) {
        this.pname = pname;
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "pname='" + pname + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPname() {
        return pname;
    }

    public String getPrice() {
        return price;
    }
}
