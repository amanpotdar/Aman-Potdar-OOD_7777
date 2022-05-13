package com.amanpotdar.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amanpotdar.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
