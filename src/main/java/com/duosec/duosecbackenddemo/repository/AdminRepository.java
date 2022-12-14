package com.duosec.duosecbackenddemo.repository;

import com.duosec.duosecbackenddemo.document.AdminDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * User: Avinash Vijayvargiya
 * Date: 15-Dec-22
 * Time: 12:05 AM
 */

@Repository
public interface AdminRepository extends MongoRepository<AdminDocument, String> {
    AdminDocument findByUsername(String username);
}
