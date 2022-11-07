package utm.pbl.ropa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utm.pbl.ropa.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
