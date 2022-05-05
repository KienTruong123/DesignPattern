package tdtu.edu.OrganizingData.EncapsulateCollection.Organizing;

import java.util.Collections;
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
		
		return Collections.unmodifiableSet(books);
	}

	public void addBooks(Book book) {
		this.books.add(book);
	}
	
	public void removeBooks(Book book) {
		this.books.remove(book);
	}
	
}
