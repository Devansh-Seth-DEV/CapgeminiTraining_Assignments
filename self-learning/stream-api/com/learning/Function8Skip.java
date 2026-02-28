package com.learning;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.model.Book;
import com.repository.BookDataSeeder;

/**
 * @Function 8: .skip(long n)
 * 
 * @brief
 * The .skip(n) function is the opposite of limit. Instead of taking the first n
 * items, it discards the first $n$ items and lets everything else pass through.
 * 
 */
public class Function8Skip {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// Suppose you want to see all your books except for the most expensive one. 
		List<Book> allButTheMostExpensive = allBooks.stream()
				.sorted(
					Comparator.comparing(Book::getPrice)
							  .reversed()
				)		 // sorted by price in descending order (highest first).
				.skip(1) // Skip that #1 expensive book.
				.collect(Collectors.toList());
		
		System.out.println("ALL BUT THE MOST EXPENSIVE");
		allButTheMostExpensive.forEach(book -> 
			System.out.println("book: { %s }".formatted(book))
		);
				
		/// --------------- YOUR TURN --------------- 
		// Imagine you want to find the second oldest book in the library.
		/// -----------------------------------------
		Optional<Book> secondOldestBook = allBooks.stream()
				.sorted(Comparator.comparing(Book::getPublishedYear))
				.skip(1)
				.findFirst();
		
		System.out.println("\n2nd OLDEST BOOK");
		System.out.println("book: { %s }".formatted(secondOldestBook));
		
		/// --------------- YOUR TURN --------------- 
		// Imagine we want to create a "Hidden Gems" list. 
		// We'll define these as the books that are not the top 5 most expensive ones
		/// -----------------------------------------
		List<Book> hiddenGemBooks = allBooks.stream()
				.sorted(
					Comparator.comparing(Book::getPrice)
							  .reversed()
				)
				.skip(5)
				.collect(Collectors.toList());
		
		System.out.println("\nHIDDEN GEM BOOKS");
		hiddenGemBooks.forEach(book ->
			System.out.println("book: { %s }".formatted(book))
		);
	}
}
