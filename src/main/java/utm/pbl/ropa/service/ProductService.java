package utm.pbl.ropa.service;

import utm.pbl.ropa.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProductList();

    Product getProductById(Integer id);

    Product createProduct(Product product);

    void deleteProduct(Integer id);

    Product updateProduct(Product product, Integer id);
}
