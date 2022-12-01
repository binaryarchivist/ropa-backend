package utm.pbl.ropa.service;

import utm.pbl.ropa.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProductList();

    Product getProductById(Long id);

    Product createProduct(Product product);

    void deleteProduct(Long id);

    Product updateProduct(Product product, Long id);
}
