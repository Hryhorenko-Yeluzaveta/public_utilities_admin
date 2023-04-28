package ua.com.public_utilities_admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.public_utilities_admin.entity.Category;
import ua.com.public_utilities_admin.entity.Rate;

import java.util.List;

public interface RateRepository extends JpaRepository<Rate, Long> {

    Rate findByName(String name);
    List<Rate> findAllByCategories(Category category);
}