package com.learning;

import java.util.List;

import com.model.Book;
import com.repository.BookDataSeeder;

/**
 * @Function 10: .anyMatch(Predicate)
 * 
 * @brief
 * Unlike the functions we've used so far, .anyMatch() is a Terminal Operation. 
 * It doesn't return a Stream or a List; it returns a boolean (true or false).
 * 
 * It asks the question: "Does at least one item in this stream satisfy this 
 * condition?" The moment it finds a single match, it stops looking 
 * and returns true.
 */
public class Function10AnyMatch {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// Imagine a customer walks in and asks,
		// "Do you have any books by George Orwell?"
		boolean hasGeorgeOrwell = allBooks.stream()
				.anyMatch(book ->
					"George Orwell".equals(book.getAuthor())
				);

		System.out.print("Has George Orwell Book: ");
		System.out.println(hasGeorgeOrwell ? "Yes" : "No");
	}
}
