package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.model.Book;

public class BookDataSeeder {
	private static final List<Book> allBooks;
	
	static {
		allBooks = new ArrayList<>();
		
		// populating dummy allBooks data
		// 1. Classic Literature
		allBooks.add(new Book("Pride and Prejudice", "Jane Austen", 10.00, 1813));
		allBooks.add(new Book("Brave New World", "Aldous Huxley", 14.50, 1932));
		allBooks.add(new Book("Animal Farm", "George Orwell", 9.00, 1945)); // Duplicate Author!

		// 2. Fantasy & Adventure
		allBooks.add(new Book("The Silmarillion", "J.R.R. Tolkien", 25.00, 1977)); // Duplicate Author!
		allBooks.add(new Book("The Fellowship of the Ring", "J.R.R. Tolkien", 18.00, 1954));
		allBooks.add(new Book("A Game of Thrones", "George R.R. Martin", 22.00, 1996));

		// 3. Modern Tech & Science
		allBooks.add(new Book("Clean Code", "Robert C. Martin", 45.00, 2008));
		allBooks.add(new Book("Effective Java", "Joshua Bloch", 55.00, 2001));
		allBooks.add(new Book("The Pragmatic Programmer", "Andrew Hunt", 42.00, 1999));

		// 4. Mystery & Sci-Fi
		allBooks.add(new Book("Murder on the Orient Express", "Agatha Christie", 11.00, 1934));
		allBooks.add(new Book("The Murder of Roger Ackroyd", "Agatha Christie", 13.00, 1926));
		allBooks.add(new Book("Dune", "Frank Herbert", 19.00, 1965));

		// 5. Contemporary & Misc
		allBooks.add(new Book("The Alchemist", "Paulo Coelho", 16.00, 1988));
		allBooks.add(new Book("Life of Pi", "Yann Martel", 15.50, 2001)); // Duplicate Year!
		allBooks.add(new Book("The Catcher in the Rye", "J.D. Salinger", 12.50, 1951));	
		
		// 6. Books with unusual titles or missing info
		allBooks.add(new Book(" ", "Anonymous", 5.00, 2020)); // Blank title
		allBooks.add(new Book("SQL Essentials", null, 35.00, 2018)); // Missing Author
		allBooks.add(new Book("Python Basics", "John Smith", 0.00, 2024)); // Free Book (0.00)

		// 7. More modern duplicates for grouping later
		allBooks.add(new Book("Spring in Action", "Craig Walls", 48.00, 2020));
		allBooks.add(new Book("Cloud Native Java", "Josh Long", 52.00, 2017));
		
		// 8. Books with identical prices to test sorting ties
		allBooks.add(new Book("Modern JS", "Dan Abramov", 45.00, 2021)); // Same price as Clean Code
		allBooks.add(new Book("Vue Essentials", "Evan You", 22.00, 2019)); // Same price as Game of Thrones
	}
	
	public static List<Book> getAllBooks() {
		return allBooks;
	}
}
