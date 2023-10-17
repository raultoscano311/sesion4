package sesion4.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sesion4.core.domain.Book;
import sesion4.core.domain.BookDoesNotExistException;
import sesion4.core.driven_ports.BookRepository;
import sesion4.db_driven_adapter.domain.BookEntity;
import sesion4.db_driven_adapter.jparepository.HAAJpaRepository;

@Component
public class JpaBookRepository implements BookRepository {
   

@Autowired //enlaza repositorio y servicio

private HAAJpaRepository haaJpaRepository;

    @Override

public Book findById(Long id) {

Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);

BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);

return bookEntity.toBook();

}

}