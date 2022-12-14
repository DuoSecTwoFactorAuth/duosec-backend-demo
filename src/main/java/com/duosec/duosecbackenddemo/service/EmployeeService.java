package com.duosec.duosecbackenddemo.service;

import com.duosec.duosecbackenddemo.document.EmployeeDocument;
import com.duosec.duosecbackenddemo.dto.Login;
import com.duosec.duosecbackenddemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Avinash Vijayvargiya
 * Date: 15-Dec-22
 * Time: 12:22 AM
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public boolean login(Login login) {
        EmployeeDocument employeeDocument = employeeRepository.findByEmployeeId(login.getUsername());
        return employeeDocument.getPassword().equals(login.getPassword());
    }

    public EmployeeDocument getEmployeeDetails(String employeeId) {
        EmployeeDocument employeeDocument = employeeRepository.findByEmployeeId(employeeId);
        return new EmployeeDocument(employeeDocument.getEmployeeId(), "********", employeeDocument.getName(), employeeDocument.getEmailId(), employeeDocument.getPhoneNumber());
    }
}
