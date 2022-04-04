package cg.service;

import cg.model.Product;

import java.util.List;

public interface IProductService {
    Product findById(Long id);
    Product save(Product product);
    void deleteById(Long id);
    List<Product> getAll();
    List<Product> findAllByNameProductContaining(String name);
}
