package com.learning;

import java.util.List;
import java.util.stream.Collectors;

import com.model.Book;
import com.repository.BookDataSeeder;

/**
 * @Function 5: .limit(long n)
 * 
 * @brief
 * The .limit(n) function is an intermediate operation. 
 * Think of it as a "stop gate" in your pipeline.
 * 
 * Once the stream has processed $n$ items, limit shuts the gate and says, 
 * "That's enough!" Even if there are 1,000 more books waiting in the stream, 
 * they get ignored.
 * 
 */
public class Function5Limit {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// Imagine your library has a "New Arrival" shelf that only has space
		// for 3 books. You want to take your list of books and grab just the 
		// first three to display.
		List<Book> shelf = allBooks.stream()
				.limit(3)	// Only the first 3 books pass through
				.collect(Collectors.toList());

		shelf.forEach(book -> 
			System.out.println("book: { %s }".formatted(book))
		);
		
		/// Combining limit with other functions
		// `limit` becomes very powerful when you use it after sorting.
		// If I want the 3 most expensive books:
		// 1. sort the books by price in descending order (highest to lowest).
		// 2. limit(3) to take only the top three.
		
		/// [NOTE!]: There is a small catch. The order of operations matters.
		// f you use limit(3) before you sort, you are only sorting the first 3 books 
		// that happened to be in the list. To get the "Top 3" of the whole library, 
		// you must sort the whole library first.
	}
}
