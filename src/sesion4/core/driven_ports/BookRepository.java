package sesion4.core.driven_ports;

import sesion4.core.domain.Book;

public interface BookRepository {

	Book findById(Long id);

}