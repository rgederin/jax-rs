package jaxrs.jersey.datasource;

import java.io.Serializable;


public class Book implements Serializable {

	private long id;
	private String authors;
	private String name;

	public Book() {
		super();
	}

	public Book(long id, String authors, String name) {
		super();
		this.id = id;
		this.authors = authors;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
