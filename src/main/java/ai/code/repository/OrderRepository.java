package ai.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<ai.code.model.Order, Long> {
}
