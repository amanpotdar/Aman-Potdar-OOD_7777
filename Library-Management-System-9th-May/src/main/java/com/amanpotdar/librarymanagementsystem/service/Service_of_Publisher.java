package com.amanpotdar.librarymanagementsystem.service;

import java.util.List;

import com.amanpotdar.librarymanagementsystem.entity.name_of_the_publisher;

public interface Service_of_Publisher {

	public List<name_of_the_publisher> findAllPublishers();

	public name_of_the_publisher findPublisherById(Long id);

	public void createPublisher(name_of_the_publisher publisher);

	public void updatePublisher(name_of_the_publisher publisher);

	public void deletePublisher(Long id);

}
