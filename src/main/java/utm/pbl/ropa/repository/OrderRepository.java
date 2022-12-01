package utm.pbl.ropa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utm.pbl.ropa.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
