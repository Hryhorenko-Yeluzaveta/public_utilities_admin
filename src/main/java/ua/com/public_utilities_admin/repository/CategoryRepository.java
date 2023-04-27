package ua.com.public_utilities_admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.public_utilities_admin.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}