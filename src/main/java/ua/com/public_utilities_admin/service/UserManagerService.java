package ua.com.public_utilities_admin.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.public_utilities_admin.repository.CustomerRepository;
import ua.com.public_utilities_admin.repository.UserRepository;

@Service
public class UserManagerService {

    private final UserRepository userRepository;
    private final CustomerRepository customerRepository;

    @Autowired
    public UserManagerService(UserRepository userRepository, CustomerRepository customerRepository) {
        this.userRepository = userRepository;
        this.customerRepository = customerRepository;
    }

}