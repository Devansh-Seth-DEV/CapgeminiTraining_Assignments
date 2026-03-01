package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.model.Book;

public class BookDataSeeder {
	private static final List<Book> allBooks;
	
	static {
		allBooks = new ArrayList<>();
		
		// populating dummy allBooks data
		// Original Data
		allBooks.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.00, 1925, 180));
		allBooks.add(new Book("1984", "George Orwell", 12.00, 1949, 328));
		allBooks.add(new Book("The Hobbit", "J.R.R. Tolkien", 20.00, 1937, 310));
		allBooks.add(new Book("Java Programming", "John Smith", 50.00, 2023, 850));

		// 1. Classic Literature
		allBooks.add(new Book("Pride and Prejudice", "Jane Austen", 10.00, 1813, 432));
		allBooks.add(new Book("Brave New World", "Aldous Huxley", 14.50, 1932, 268));
		allBooks.add(new Book("Animal Farm", "George Orwell", 9.00, 1945, 112)); // Duplicate Author!

		// 2. Fantasy & Adventure
		allBooks.add(new Book("The Silmarillion", "J.R.R. Tolkien", 25.00, 1977, 365)); // Duplicate Author!
		allBooks.add(new Book("The Fellowship of the Ring", "J.R.R. Tolkien", 18.00, 1954, 423));
		allBooks.add(new Book("A Game of Thrones", "George R.R. Martin", 22.00, 1996, 694));

		// 3. Modern Tech & Science
		allBooks.add(new Book("Clean Code", "Robert C. Martin", 45.00, 2008, 464));
		allBooks.add(new Book("Effective Java", "Joshua Bloch", 55.00, 2001, 412));
		allBooks.add(new Book("The Pragmatic Programmer", "Andrew Hunt", 42.00, 1999, 352));

		// 4. Mystery & Sci-Fi
		allBooks.add(new Book("Murder on the Orient Express", "Agatha Christie", 11.00, 1934, 256));
		allBooks.add(new Book("The Murder of Roger Ackroyd", "Agatha Christie", 13.00, 1926, 312));
		allBooks.add(new Book("Dune", "Frank Herbert", 19.00, 1965, 612));

		// 5. Contemporary & Misc
		allBooks.add(new Book("The Alchemist", "Paulo Coelho", 16.00, 1988, 208));
		allBooks.add(new Book("Life of Pi", "Yann Martel", 15.50, 2001, 319)); // Duplicate Year!
		allBooks.add(new Book("The Catcher in the Rye", "J.D. Salinger", 12.50, 1951, 277));	

		// 6. Edge Cases
		allBooks.add(new Book(" ", "Anonymous", 5.00, 2020, 50)); // Blank title
		allBooks.add(new Book("SQL Essentials", null, 35.00, 2018, 220)); // Missing Author
		allBooks.add(new Book("Python Basics", "John Smith", 0.00, 2024, 150)); // Free Book (0.00)

		// 7. Modern Duplicates
		allBooks.add(new Book("Spring in Action", "Craig Walls", 48.00, 2020, 520));
		allBooks.add(new Book("Cloud Native Java", "Josh Long", 52.00, 2017, 620));

		// 8. Sorting Ties
		allBooks.add(new Book("Modern JS", "Dan Abramov", 45.00, 2021, 300)); // Same price as Clean Code
		allBooks.add(new Book("Vue Essentials", "Evan You", 22.00, 2019, 280)); // Same price as Game of Thrones
	}
	
	public static List<Book> getAllBooks() {
		return allBooks;
	}
}
