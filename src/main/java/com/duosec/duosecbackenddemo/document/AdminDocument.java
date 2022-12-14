package com.duosec.duosecbackenddemo.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * User: Avinash Vijayvargiya
 * Date: 15-Dec-22
 * Time: 12:06 AM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("AdminDocument")
public class AdminDocument {
    private String username;
    private String password;
    private String emailId;
    private String companyName;
}
