package jaxrs.jersey.datasource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Simple class with data for our Web Service
 * 
 * @author rgederin
 * 
 */
public class DataBase {
	private static volatile DataBase instance;
	private static volatile List<Book> books = Collections
			.synchronizedList(new ArrayList<Book>());

	private DataBase() {
		books.add(new Book(0, "Tolkien", "The Lord of the Rings"));
		books.add(new Book(1, "J. K. Rouling", "Harry Potter"));
		books.add(new Book(2, "Key Horstman", "Scala for Impatient"));
	}

	public static DataBase getInstance() {
		if (instance == null) {
			synchronized (DataBase.class) {
				if (instance == null) {
					instance = new DataBase();
				}
			}
		}
		return instance;
	}
}
