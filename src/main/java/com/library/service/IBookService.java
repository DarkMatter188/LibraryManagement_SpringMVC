package com.library.service;

import com.library.model.*;
import java.util.List;
import java.util.Optional;

public interface IBookService {
	public List<Book> findAllBooks();

	public Book saveBook(Book book);

	public void deleteById(Integer id);

	public Optional<Book> findBookById(Integer id);
}
