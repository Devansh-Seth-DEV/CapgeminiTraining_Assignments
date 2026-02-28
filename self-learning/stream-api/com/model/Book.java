package com.model;

public class Book {
	private String title;
	private String author;
	private Double price;
	private Integer publishedYear;
	
	public Book() { super(); }
	
	public Book(
		String title,
		String author,
		Double price,
		Integer publishedYear
	) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publishedYear = publishedYear;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(Integer publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public String toString() {
		return "title: %s, author: %s, price: %s, published_year: %s"
				.formatted(
					title,
					author,
					price,
					publishedYear
				);
	}
}
