package com.learning;

import java.util.List;
import java.util.stream.IntStream;

import com.model.Book;
import com.repository.BookDataSeeder;

/**
 * @Function 13: .mapToInt(ToIntFunction)
 * 
 * @brief
 * The standard .map() function we learned earlier produces a stream of Objects
 * (like a Stream<Integer> or Stream<Double>). In Java, these are "boxed" objects,
 * which are a bit heavy for math.
 * 
 * .mapToInt() is an intermediate operation that transforms your stream into a 
 * primitive IntStream. Think of this as a specialized, high-performance conveyor 
 * belt that only carries raw integers. This "primitive" stream unlocks 
 * special math powers that the regular stream doesn't have.
 * 
 * @note
 * Once you are in an IntStream, you have access to functions like .sum(), 
 * .min(), .max(), and .average().
 */
public class Function13MapToInt {
	private static List<Book> allBooks;
	
	static {
		allBooks = BookDataSeeder.getAllBooks();
	}
	
	public static void main(String[] args) {
		// Suppose we want to extract just the page counts into a raw list of 
		// numbers to send to a different part of our program.
		IntStream pageCountStream = allBooks.stream()
			    .mapToInt(book -> book.getPageCount());

		System.out.println("ALL BOOKS PAGE COUNT");
		pageCountStream.forEach(System.out::println);
	}
}
