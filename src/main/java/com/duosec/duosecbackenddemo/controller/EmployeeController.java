package com.duosec.duosecbackenddemo.controller;

import com.duosec.duosecbackenddemo.document.EmployeeDocument;
import com.duosec.duosecbackenddemo.dto.Login;
import com.duosec.duosecbackenddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Avinash Vijayvargiya
 * Date: 15-Dec-22
 * Time: 12:22 AM
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee-login")
    public ResponseEntity<Boolean> employeeLogin(@RequestBody Login login) {
        try {
            if (employeeService.login(login))
                return new ResponseEntity<>(true, HttpStatus.ACCEPTED);
            return new ResponseEntity<>(false, HttpStatus.UNAUTHORIZED);
        } catch (Exception exception) {
            return new ResponseEntity<>(false, HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping("/employee-data")
    public ResponseEntity<EmployeeDocument> getEmployeeDetails(@RequestParam String employeeId) {
        try {
            return new ResponseEntity<>(employeeService.getEmployeeDetails(employeeId), HttpStatus.ACCEPTED);
        } catch (Exception exception) {
            return new ResponseEntity<>(new EmployeeDocument(), HttpStatus.NOT_FOUND);
        }
    }
}
