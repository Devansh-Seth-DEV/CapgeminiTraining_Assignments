package com.learning;

import java.util.List;

import com.model.Book;
import com.repository.BookDataSeeder;

/**
 * @Function 14: .sum()
 * 
 * @brief
 * This is a terminal operation available on primitive streams (IntStream, 
 * LongStream, DoubleStream). It does exactly what it says: it adds up every number 
 * in the stream and returns the total as a primitive value (int, long, or double).
 */
public class Function14Sum {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// If we want to know how many total pages are in our books published after
		// 1998 (books by Robert C. Martin, Joshua Bloch, and Andrew Hunt).
		int totalPages = allBooks.stream()
				.filter(book ->
					book.getPublishedYear() > 1998 &&
					book.getAuthor() != null
				)								// Filtering modern books
				.filter(book ->
					book.getAuthor().contains("Robert C. Martin") ||
					book.getAuthor().contains("Joshua Bloch") ||
					book.getAuthor().contains("Andrew Hunt")
				)
				.mapToInt(Book::getPageCount) 	// Transform to IntStream
				.sum();						  	// Terminal math operation

		System.out.println("Total Tech Pages: " + totalPages);
		

		/// --------------- YOUR TURN --------------- 
		// Using our allBooks collection, how would you calculate the total price 
		// of all books in the library?
		/// -----------------------------------------
		double allBooksPrice = allBooks.stream()
				.mapToDouble(Book::getPrice)
				.sum();
		
		System.out.println("All Books Price: " + allBooksPrice);
	}
}
