package com.mk.bookpub.repository;

import com.mk.bookpub.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {

    public Book findBookByIsbn(String isbn);
}
