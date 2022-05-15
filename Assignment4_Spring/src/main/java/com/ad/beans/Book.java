package com.ad.beans;


// Book Class
public class Book {

		// Creating Fields based on Book Table in Library database
		private int bookId; 
		private String title;
		private float price;
		private String author;
		private String available;
		
		
		// Setting Getters and Setters
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}


		public String getAvailable() {
			return available;
		}
		public void setAvailable(String available) {
			this.available = available;
		}
		
		// toString Method to show the proper message 
		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + ", author=" + author
					+ ", available=" + available + "]";
		}
	 
		

	}


