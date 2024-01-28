package com.library.dao;

import org.springframework.data.repository.CrudRepository;

import com.library.model.Book;

public interface IBookRepository extends CrudRepository<Book, Integer> {
	
}
