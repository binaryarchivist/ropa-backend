package utm.pbl.ropa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import utm.pbl.ropa.dto.mapper.ProductMapper;
import utm.pbl.ropa.dto.model.ProductDto;
import utm.pbl.ropa.model.Product;
import utm.pbl.ropa.service.ProductService;
import static utm.pbl.ropa.dto.mapper.ProductMapper.toProductDto;

import java.util.List;

@RestController
@RequestMapping(path = "products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDto> getProductList() {
        return productService.getProductList()
                .stream()
                .map(ProductMapper::toProductDto)
                .toList();
    }

    @GetMapping("{id}")
    public ProductDto getProductById(@PathVariable Integer id) {
        return toProductDto(productService.getProductById(id));
    }

    @PostMapping
    public ProductDto createProduct(@RequestBody Product product) {
        return toProductDto(productService.createProduct(product));
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }

    @PutMapping("{id}")
    public ProductDto updateProduct(@RequestBody Product product, @PathVariable Integer id) {
        return toProductDto(this.productService.updateProduct(product, id));
    }
}
