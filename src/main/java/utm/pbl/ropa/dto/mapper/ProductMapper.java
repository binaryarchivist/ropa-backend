package utm.pbl.ropa.dto.mapper;

import utm.pbl.ropa.dto.model.ProductDto;
import utm.pbl.ropa.model.Product;


public class ProductMapper {
    public static ProductDto toProductDto(Product product) {
        ProductDto productDto = new ProductDto();

        productDto.setProductId(product.getProductId());
        productDto.setEta(product.getEta());
        productDto.setDescription(product.getDescription());
        productDto.setWeight(product.getWeight());
        productDto.setPrice(product.getPrice());
        productDto.setName(product.getName());

        return productDto;
    }
}
