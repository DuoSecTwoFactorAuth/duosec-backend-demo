package com.duosec.duosecbackenddemo.repository;

import com.duosec.duosecbackenddemo.document.EmployeeDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<EmployeeDocument, String> {

}
