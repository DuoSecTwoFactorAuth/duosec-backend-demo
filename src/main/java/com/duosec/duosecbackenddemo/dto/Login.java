package com.duosec.duosecbackenddemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User: Avinash Vijayvargiya
 * Date: 15-Dec-22
 * Time: 12:07 AM
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Login {
    private String username;
    private String password;
}
