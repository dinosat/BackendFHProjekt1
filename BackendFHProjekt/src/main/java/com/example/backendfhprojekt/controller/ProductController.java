package com.example.backendfhprojekt.controller;
import com.example.backendfhprojekt.model.Product;
import com.example.backendfhprojekt.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> GetAllProducts() {
        return productService.GetAllProducts();
    }

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        Long bookAuthorId = product.getBookAuthor().getBookAuthorId();
        Long categoryId = product.getCategory().getCategoryId();
        productService.saveProduct(product, bookAuthorId, categoryId);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @GetMapping(path="/{productId}")
    public Optional<Product> getProductById(@PathVariable Long productId) {
        return productService.getProductById(productId);
    }



    @PutMapping("{productId}")
    public Product updateProduct(@PathVariable Long productId, @RequestBody Product productDetails) {
        return productService.updateProduct(productId, productDetails);
    }

    @DeleteMapping("{productId}")
    public void deleteProductById( @PathVariable  Long productId) {
        productService.deleteProductById(productId);
    }
}
