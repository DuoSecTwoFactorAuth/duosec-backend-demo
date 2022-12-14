package com.duosec.duosecbackenddemo.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * User: Avinash Vijayvargiya
 * Date: 15-Dec-22
 * Time: 12:14 AM
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("EmployeeDocument")
public class EmployeeDocument {
    private String employeeId;
    private String password;
    private String name;
    private String emailId;
    private String phoneNumber;
}
