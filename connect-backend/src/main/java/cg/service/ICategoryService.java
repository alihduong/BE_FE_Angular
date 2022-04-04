package cg.service;

import cg.model.Category;

import java.util.List;

public interface ICategoryService {
    Category findById(Long idCategory);

    Category saveCategory(Category category);

    void deleteCategoryById(Long idCategory);

    List<Category> getAllCategory();
}
