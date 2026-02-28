package com.learning;

import java.util.List;
import java.util.stream.Collectors;

import com.model.Book;
import com.repository.BookDataSeeder;

/**
 * @Function 9: .peek(Consumer)
 * 
 * @brief
 * This is a very handy function for "Library Makers" and developers. peek allows you 
 * to look at the elements in the stream without changing them. It is mainly used for
 * debugging.
 * 
 */
public class Function9Peek {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// Suppose you want to print all your books having price < 20
		List<Book> cheapBooks = allBooks.stream()
				.filter(book -> book.getPrice() < 20)
				.peek(book ->
					System.out.println("Filtered Book: " + book.getTitle())
				) 	// Just for Logging/Debugging
				.collect(Collectors.toList());
		
		System.out.println("\nCHEAP BOOKS");
		cheapBooks.forEach(book ->
			System.out.println("book: { %s }".formatted(book))
		);
	}
}
