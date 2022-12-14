package com.duosec.duosecbackenddemo.controller;

import com.duosec.duosecbackenddemo.document.EmployeeDocument;
import com.duosec.duosecbackenddemo.dto.Login;
import com.duosec.duosecbackenddemo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Avinash Vijayvargiya
 * Date: 15-Dec-22
 * Time: 12:04 AM
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/admin-login")
    public ResponseEntity<Boolean> adminLogin(@RequestBody Login login) {
        try {
            if (adminService.login(login))
                return new ResponseEntity<>(true, HttpStatus.ACCEPTED);
            return new ResponseEntity<>(false, HttpStatus.UNAUTHORIZED);
        } catch (Exception exception) {
            return new ResponseEntity<>(false, HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @PostMapping("/add-employee")
    public ResponseEntity<Boolean> addAdmin(@RequestBody EmployeeDocument employeeDocument) {
        try {
            return new ResponseEntity<>(adminService.addEmployee(employeeDocument), HttpStatus.ACCEPTED);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return new ResponseEntity<>(false, HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
