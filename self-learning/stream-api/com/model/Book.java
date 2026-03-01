package com.model;

public class Book {
	private String title;
	private String author;
	private Double price;
	private Integer publishedYear;
	private Integer pageCount;
	
	public Book() { super(); }
	
	public Book(
		String title,
		String author,
		Double price,
		Integer publishedYear,
		Integer pageCount
	) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publishedYear = publishedYear;
		this.setPageCount(pageCount);
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

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
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
