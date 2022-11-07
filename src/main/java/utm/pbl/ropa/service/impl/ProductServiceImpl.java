package utm.pbl.ropa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utm.pbl.ropa.dto.mapper.ProductMapper;
import utm.pbl.ropa.dto.model.ProductDto;
import utm.pbl.ropa.repository.ProductRepository;
import utm.pbl.ropa.service.ProductService;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDto> getProductList() {
        return productRepository
                .findAll()
                .stream()
                .map(ProductMapper::toProductDto)
                .toList();
    }
}
