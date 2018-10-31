package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Book;
import org.springframework.stereotype.Repository;

/**
 * Spring Data Couchbase repository for the Book entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BookRepository extends N1qlCouchbaseRepository<Book, String> {

}
