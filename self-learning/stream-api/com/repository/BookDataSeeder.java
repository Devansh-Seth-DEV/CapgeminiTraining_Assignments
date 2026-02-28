package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.model.Book;

public class BookDataSeeder {
	private static final List<Book> allBooks;
	
	static {
		allBooks = new ArrayList<>();
		
		// populating dummy allBooks data
		allBooks.add(
			new Book(
				"The Great Gatsby",
				"F.Scott Fitzgerald",
				15.00,
				1925
			)
		);
		
		allBooks.add(
			new Book(
				"1984",
				"George Orwell",
				12.00,
				1949
			)
		);
		
		allBooks.add(
			new Book(
				"The Hobbit",
				"J.R.R. Tolkien",
				20.00,
				1937
			)
		);

		allBooks.add(
				new Book(
					"Java Programming",
					"John Smith",
					50.00,
					2023
				)
			);		
	}
	
	public static List<Book> getAllBooks() {
		return allBooks;
	}
}
