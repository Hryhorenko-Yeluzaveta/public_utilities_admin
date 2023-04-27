package ua.com.public_utilities_admin.repository;

import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.public_utilities_admin.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}