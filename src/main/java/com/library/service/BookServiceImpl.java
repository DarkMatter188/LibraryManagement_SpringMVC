package com.library.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.dao.IBookRepository;
import com.library.model.Book;

@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	
	private IBookRepository repo;

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(repo.findAll().spliterator(), false).collect(Collectors.toList());
	}

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

	@Override
	public Optional<Book> findBookById(Integer id) {
		// TODO Auto-generated method stub
		
		return repo.findById(id);
	}

}
