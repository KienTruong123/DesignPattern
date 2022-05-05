package tdtu.edu.OrganizingData.EncapsulateCollection.Normal;

import java.util.HashSet;
import java.util.Set;

import tdtu.edu.OrganizingData.EncapsulateCollection.Book;

public class Library {
	Set<Book> books =null;

	public Library() {
		super();
		books= new HashSet<Book>();
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
}
