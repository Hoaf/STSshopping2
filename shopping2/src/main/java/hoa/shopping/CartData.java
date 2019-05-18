package hoa.shopping;

import hoa.shopping.entities.Product;

import java.io.Serializable;

public class CartData implements Serializable {
    private Product product;
    private int quantity;
    private int productId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CartData() {
    }
}
