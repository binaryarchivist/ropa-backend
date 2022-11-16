package utm.pbl.ropa.model;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="ropa_order")
public class Order {
    @Id
    @SequenceGenerator(name = "orderSeqGen", sequenceName = "orderSeq", allocationSize = 100)
    @GeneratedValue(generator = "orderSeqGen")
    private Integer orderId;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    private Product product;

    public Order() {
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
