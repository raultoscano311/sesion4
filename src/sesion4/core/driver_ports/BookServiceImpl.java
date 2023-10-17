package sesion4.core.driver_ports;

import sesion4.core.domain.Book;
import sesion4.core.driven_ports.BookRepository;

public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {

		this.bookRepository = bookRepository;

	}

	public Book getBook(Long id) {

		return bookRepository.findById(id);

	}

}