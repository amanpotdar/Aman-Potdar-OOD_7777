package com.amanpotdar.librarymanagementsystem.service;

import java.util.List;

import com.amanpotdar.librarymanagementsystem.entity.Category;

public interface Service_of_Category {

	public List<Category> findAllCategories();

	public Category findCategoryById(Long id);

	public void createCategory(Category category);

	public void updateCategory(Category category);

	public void deleteCategory(Long id);

}
