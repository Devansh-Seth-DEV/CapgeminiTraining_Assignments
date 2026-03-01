package com.learning;

import java.util.List;

import com.model.Book;
import com.repository.BookDataSeeder;

/**
 * @Function 11: .allMatch(Predicate)
 * 
 * @brief
 * This is the "Strict Teacher" of terminal operations. 
 * It only returns true if every single item in the stream meets the condition. 
 * If even one item fails, it returns false.
 */
public class Function11AllMatch {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// The library wants to verify their data. They want to check: 
		// "Are all books in our system priced at 1.00 or more?" (Basically, making 
		// sure nothing is accidentally mispriced as free or negative).
		boolean allPricedProperly = allBooks.stream()
				.allMatch(book -> book.getPrice() >= 1.00);

		System.out.print("All Priced Properly: ");
		System.out.println(allPricedProperly ? "Yes" : "No");
		
		/// --------------- YOUR TURN --------------- 
		// How would you write a stream to check if the library has any books 
		// published before the year 1800?
		/// -----------------------------------------
		boolean hasBooksBefore1800 = allBooks.stream()
				.anyMatch(book -> book.getPublishedYear() < 1800);
		
		System.out.print("Has Books Published Before 1800: ");
		System.out.println(hasBooksBefore1800 ? "Yes" : "No");
	}
}
