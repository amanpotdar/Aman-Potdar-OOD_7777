package com.amanpotdar.librarymanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.amanpotdar.librarymanagementsystem.entity.name_of_the_publisher;
import com.amanpotdar.librarymanagementsystem.exception.NotFoundException;
import com.amanpotdar.librarymanagementsystem.repository.PublisherRepository;
import com.amanpotdar.librarymanagementsystem.service.Service_of_Publisher;

@Service
public class PublisherServiceImpl implements Service_of_Publisher {

	private final PublisherRepository publisherRepository;

	public PublisherServiceImpl(PublisherRepository publisherRepository) {
		this.publisherRepository = publisherRepository;
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	@Override
	public List<name_of_the_publisher> findAllPublishers() {
		return publisherRepository.findAll();
	}

	@Override
	public name_of_the_publisher findPublisherById(Long id) {
		return publisherRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("Publisher not found  with ID %d", id)));
	}

	@Override
	public void createPublisher(name_of_the_publisher publisher) {
		publisherRepository.save(publisher);
	}

	@Override
	public void updatePublisher(name_of_the_publisher publisher) {
		publisherRepository.save(publisher);
	}

	@Override
	public void deletePublisher(Long id) {
		final name_of_the_publisher publisher = publisherRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("Publisher not found  with ID %d", id)));

		publisherRepository.deleteById(publisher.getId());
	}

}
