package utm.pbl.ropa.dto.model;

// Example Dto class
public class ProductDto {
    private Integer productId;

    private String description;
    private Integer price;
    private Integer weight;
    private Integer eta;

    public ProductDto() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "productId=" + productId +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", eta=" + eta +
                '}';
    }
}