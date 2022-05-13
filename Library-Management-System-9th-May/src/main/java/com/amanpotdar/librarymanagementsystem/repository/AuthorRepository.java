package com.amanpotdar.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amanpotdar.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
