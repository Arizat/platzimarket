package com.platzi.platzimarket.domain.repository;

import com.platzi.platzimarket.domain.Product;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional <List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quanty);

    Optional<Product> getProduct(int productId);

    Product save (Product product);
    void delete (int productId);
}
