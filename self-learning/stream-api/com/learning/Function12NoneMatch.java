package com.learning;

import java.util.List;

import com.model.Book;
import com.repository.BookDataSeeder;

/**
 * @Function 12: .noneMatch(Predicate)
 * 
 * @brief
 * This is the third sibling in the matching family. It returns true only if 
 * none of the elements satisfy the condition. It’s the opposite of anyMatch.
 */
public class Function12NoneMatch {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// Checking if there are "No books with a null title."
		boolean noNullTitles = allBooks.stream()
				.noneMatch(book -> book.getTitle() == null);

		System.out.print("No books with a null title: ");
		System.out.println(noNullTitles ? "Yes" : "No");
	}
}
