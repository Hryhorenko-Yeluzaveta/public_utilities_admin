package ua.com.public_utilities_admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.public_utilities_admin.entity.Customer;
import java.util.List;
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}