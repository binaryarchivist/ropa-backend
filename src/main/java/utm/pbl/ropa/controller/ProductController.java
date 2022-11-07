package utm.pbl.ropa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utm.pbl.ropa.dto.model.ProductDto;
import utm.pbl.ropa.service.ProductService;

import java.util.List;

@RestController
@RequestMapping(path="products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDto> getProductList() {
        return productService.getProductList();
    }
}