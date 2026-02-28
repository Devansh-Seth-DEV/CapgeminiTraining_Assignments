package com.learning;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.model.Book;
import com.repository.BookDataSeeder;

/**
 * @Function 7: .distinct()
 * 
 * @brief
 * Now, let's look at another intermediate operation. .distinct() is used to remove 
 * duplicate elements from a stream. It uses the equals() method of the object to 
 * decide if two things are the same.
 * 
 */
public class Function7Distinct {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// Suppose your library list has multiple copies of the same book, 
		// but you want to get a list of unique Authors present in your collection.
		List<String> uniqueAuthors = allBooks.stream()
				.map(Book::getAuthor)	// First, get all author names
				.distinct()				// Remove duplicates
				.collect(Collectors.toList());
				
		/// --------------- YOUR TURN --------------- 
		// Imagine your library has 50 books, but many are written by the same person.
		// If you wanted to find the 3 oldest unique publication years represented in 
		// your library
		/// -----------------------------------------
		List<Integer> oldestUniquePublicationYears = allBooks.stream()
				.map(Book::getPublishedYear)
				.distinct()
				.sorted()
				.limit(3)
				.collect(Collectors.toList());
	}
}
