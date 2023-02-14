package com.example.backendfhprojekt.service;

import com.example.backendfhprojekt.model.BookAuthor;
import com.example.backendfhprojekt.model.Category;
import com.example.backendfhprojekt.model.Product;
import com.example.backendfhprojekt.repository.BookAuthorRepository;
import com.example.backendfhprojekt.repository.CategoryRepository;
import com.example.backendfhprojekt.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final CategoryRepository categoryRepository;
    private final BookAuthorRepository bookAuthorRepository;
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository, BookAuthorRepository bookAuthorRepository, CategoryRepository categoryRepository) {
        this.bookAuthorRepository = bookAuthorRepository;
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Product> GetAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long productId) {
        return productRepository.findById(productId);
    }


    @Transactional
    public void saveProduct(Product product, Long bookAuthorId, Long categoryId) {
        if (bookAuthorId != null) {
            BookAuthor bookAuthor = bookAuthorRepository.findById(bookAuthorId).orElseThrow();
            product.setBookAuthor(bookAuthor);
        }
        if (categoryId != null) {
            Category category = categoryRepository.findById(categoryId).orElseThrow();
            product.setCategory(category);
        }
        productRepository.save(product);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long productId, Product productDetails) {
        Product product = productRepository.findById(productId).orElseThrow();
        product.setProductDescription(productDetails.getProductDescription());
        product.setProductName(productDetails.getProductName());
        product.setProductPrice(productDetails.getProductPrice());
        product.setProductQuantity(productDetails.getProductQuantity());
        return productRepository.save(product);
    }


    public void deleteProductById(Long productId) {
        productRepository.deleteById(productId);
    }

}
