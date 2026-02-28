package com.learning;

import java.util.List;
import java.util.stream.Collectors;

import com.model.Book;
import com.repository.BookDataSeeder;

// In the Stream API, we categorize functions into two types:
// 1. Intermediate Operations (like filter): 
//			These transform the data but stay as a "stream." 
//			You can chain many of these together.
//
// 2. Terminal Operations (like collect): 
//			These close the stream and produce a final result, 
//			like a List, a Map, or a single number.

/**
 * @Function 2: .collect(Collector)
 * 
 * @brief
 * Think of collect as the "bucket" at the end of the pipeline.
 * Without it, your filtered data is just floating in the stream; 
 * collect gathers those items and puts them back into a concrete collection 
 * you can actually use in the rest of your Java code.
 *
 * @usecase
 * Collectors.toList() is the most frequent partner for this function. 
 * It tells Java: "Take everything that made it through the filters and 
 * put it into a new ArrayList."
 * 
 */
public class Function2Collect {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// If we wanted to filter our library to find 
		// only the books published before 1940
		List<Book> before1940Books = allBooks.stream()
				.filter(book -> book.getPublishedYear() < 1940)
				.collect(Collectors.toList()); // converts stream into List<Book>
	}
}
