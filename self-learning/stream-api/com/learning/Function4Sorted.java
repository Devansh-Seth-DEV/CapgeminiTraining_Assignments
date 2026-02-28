package com.learning;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.model.Book;
import com.repository.BookDataSeeder;

/**
 * @Function 4: .sorted(Comparator)
 * 
 * @brief
 * Now that we have our data filtered and transformed, 
 * we often need to put it in a specific order. 
 * The sorted function takes a Comparator to decide the sequence. 
 * 
 */
public class Function4Sorted {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// Let's say we want to see the titles of all books, 
		// but we want them in alphabetical order. 
		List<String> alphabeticalTitles = allBooks.stream()
				.map(Book::getTitle) // Extract titles
				.sorted()			 // Sort Strings alphabetically (default)
				.collect(Collectors.toList());
		
		// If we want to sort by a specific property—like Price
		// we use Comparator.comparing()
		List<Book> cheapestFirst = allBooks.stream()
				.sorted(Comparator.comparing(Book::getPrice))
				.collect(Collectors.toList());
	}
}
