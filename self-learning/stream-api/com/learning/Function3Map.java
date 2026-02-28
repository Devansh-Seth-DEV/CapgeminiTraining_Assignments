package com.learning;

import java.util.List;
import java.util.stream.Collectors;

import com.model.Book;
import com.repository.BookDataSeeder;

/**
 * @Function 3: .map(Function)
 * 
 * @brief
 * Now that we can filter and save our data, let's look at transformation.
 * The map function is used to convert an object into something else. 
 * It doesn't change the number of items in the stream; 
 * it just changes what they are.
 * 
 */
public class Function3Map {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// Imagine you don't want the full Book objects anymore. 
		// You just want a list of the Titles (Strings) 
		// so you can print them on a poster.
		List<String> bookTitles = allBooks.stream()
				.map(book -> book.getTitle()) // Transform Book object -> String (Titles)
				.collect(Collectors.toList());
		
		/// --------------- YOUR TURN --------------- 
		// If you wanted to get a list of only the Authors' names for books 
		// that cost more than 30.00, 
		// how would you chain the filter and map functions together?
		/// -----------------------------------------
		List<String> bookAuthors = allBooks.stream()
				.filter(book -> book.getPrice() > 30.00)
				.map(book -> book.getAuthor())
				.collect(Collectors.toList());
	}
}
