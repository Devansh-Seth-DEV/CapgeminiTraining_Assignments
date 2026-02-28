package com.learning;

import java.util.List;
import java.util.stream.Collectors;

import com.model.Book;
import com.repository.BookDataSeeder;

/**
 * @Function 1: .filter(Predicate)
 * 
 * @brief
 * The `filter` function is used to select specific elements based on a 
 * condition (a boolean check). It’s like a sieve that only lets certain 
 * items pass through.
 *
 */
public class Function1Filter {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// Suppose we want to find only the expensive books 
		// (any book that costs more than 20.00).
		
		// In this case, the stream looks at every book,
		// checks the price, and only keeps the ones where the condition is true.
		List<Book> expensiveBooks = allBooks.stream()
				.filter(book -> book.getPrice() > 20.00) // This is the filter!
				.collect(Collectors.toList());
		
		expensiveBooks.forEach(book -> 
			System.out.println("book: { %s }".formatted(book))
		);
	}
}
