package ua.com.public_utilities_admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.public_utilities_admin.entity.Rate;

public interface RateRepository extends JpaRepository<Rate, Long> {
}