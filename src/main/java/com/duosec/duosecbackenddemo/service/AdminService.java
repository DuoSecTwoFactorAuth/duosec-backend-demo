package com.duosec.duosecbackenddemo.service;

import com.duosec.duosecbackenddemo.document.AdminDocument;
import com.duosec.duosecbackenddemo.dto.Login;
import com.duosec.duosecbackenddemo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Avinash Vijayvargiya
 * Date: 15-Dec-22
 * Time: 12:08 AM
 */

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public boolean login(Login login) {
        AdminDocument adminDocument = adminRepository.findByUsername(login.getUsername());
        return adminDocument.getPassword().equals(login.getPassword());
    }
}
