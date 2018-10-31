package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Authority;


/**
 * Spring Data Couchbase repository for the Authority entity.
 */
public interface AuthorityRepository extends N1qlCouchbaseRepository<Authority, String> {
}
