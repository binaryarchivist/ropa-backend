package utm.pbl.ropa.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="ropa_product")
public class Product {
    @Id
    @SequenceGenerator(name = "mySeqGen", sequenceName = "mySeq", allocationSize = 100)
    @GeneratedValue(generator = "mySeqGen")
    private Long productId;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Long price;

    @Column(nullable = false)
    private Long weight;

    @Column(nullable = false)
    private Long eta;

    @OneToMany
    private Set<Order> orders;

//    @OneToOne(optional = false)
//    Document document;

    public Product() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getEta() {
        return eta;
    }

    public void setEta(Long eta) {
        this.eta = eta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
