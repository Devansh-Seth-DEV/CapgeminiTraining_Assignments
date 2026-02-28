package com.learning;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.model.Book;
import com.repository.BookDataSeeder;

/**
 * @Function 6: .findFirst()
 * 
 * @brief
 * Instead of collecting to a list and then calling .get(0), 
 * we can use the terminal operation .findFirst().
 * 
 * This function returns an Optional<Book>. An Optional is like a box that might 
 * contain a book, or it might be empty. This prevents your code from crashing 
 * if no books match your criteria.
 * 
 */
public class Function6FindFirst {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// Imagine we have a list of 100 books. We want to find the single 
		// oldest book (the one with the minimum publishedYear) in the library. 
		Optional<Book> oldestBook = allBooks.stream()
				.sorted(Comparator.comparing(Book::getPublishedYear))
				.findFirst();
	}
}
