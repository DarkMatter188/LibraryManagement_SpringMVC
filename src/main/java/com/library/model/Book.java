package com.library.model;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BOOK")

public class Book implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="AUTHOR_NAME",length = 20)
	private String author;
	@Column(name="BOOK_NAME",length = 20)
	private String name;

	public Integer getId() {
		System.out.println("Book.getId()");
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
		System.out.println("Book.setId()");
	}

	public String getAuthor() {
		System.out.println("Book.getAuthor()");
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
		System.out.println("Book.setSuthor()");
	}

	public String getName() {
		System.out.println("Book.getName()");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Book.setName()");
	}

}
